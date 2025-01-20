package edu.neu.csye7374;

import java.util.HashMap;
import java.util.Map;

public class StockMarket {
    private static StockMarket instance;
    private Map<String, Stock> stocks;

    private StockMarket() {
        stocks = new HashMap<>();
    }

    public static StockMarket getInstance() {
        if (instance == null) {
            synchronized (StockMarket.class) {
                if (instance == null) {
                    instance = new StockMarket();
                }
            }
        }
        return instance;
    }

    public void addStock(Stock stock) {
        stocks.put(stock.getName(), stock);
        System.out.println("Added stock: " + stock);
    }

    public void removeStock(String stockName) {
        stocks.remove(stockName);
        System.out.println("Removed stock: " + stockName);
    }

    public void tradeStock(String stockName, String bid) {
        Stock stock = stocks.get(stockName);
        if (stock != null) {
            stock.setBid(bid);
            System.out.println("Traded stock: " + stockName + " | New Price: " + stock.getPrice());
        } else {
            System.out.println("Stock not found: " + stockName);
        }
    }

    public void displayStocks() {
        stocks.values().forEach(System.out::println);
    }
}
