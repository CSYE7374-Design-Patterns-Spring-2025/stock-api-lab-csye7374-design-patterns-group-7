package edu.neu.csye7374;

import java.util.HashMap;
import java.util.Map;

public class StockSingleton {
	
	private static StockSingleton instance;
	private final Map<String,Stock> s = new HashMap<>();
	
	private StockSingleton() {}
	
	private static class Holder {
		private static final StockSingleton INSTANCE = new StockSingleton();
	}
	public static StockSingleton getInstance() {
		return Holder.INSTANCE;
	}
	public void addStock(Stock stock) {
        s.put(stock.getName(), stock);
    }
	public void removeStock(String stockName) {
        s.remove(stockName);
    }
	public void tradeStock(String stockName, double bid) {
        Stock stock = s.get(stockName);
        if (stock != null) {
            stock.calculateAndTradeBids(bid);
        } else {
            System.out.println("Stock not found.");
        }
    }
	public void showAllStocks() {
        s.values().forEach(System.out::println);
    }
}
