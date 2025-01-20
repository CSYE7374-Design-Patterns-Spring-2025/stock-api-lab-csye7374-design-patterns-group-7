package edu.neu.csye7374;

/**
 * 
 * @author Preyash Mehta
 * 
 */

public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        //your driver code here
        // Singleton instance of StockMarket
        StockMarket stockMarket = StockMarket.getInstance();

        // Add unique stocks
        stockMarket.addStock(new TechStock("AAPL", 150.0, "Apple Inc."));
        stockMarket.addStock(new FinanceStock("JPM", 140.5, "JP Morgan Chase"));
        stockMarket.addStock(new EnergyStock("XOM", 120.3, "ExxonMobil"));

        // Display all stocks
        System.out.println("\nInitial Stocks:");
        stockMarket.displayStocks();

        // Simulate trading (6 bids per stock)
        System.out.println("\nTrading Stocks:");
        stockMarket.tradeStock("AAPL", "100");
        stockMarket.tradeStock("AAPL", "120");
        stockMarket.tradeStock("JPM", "80");
        stockMarket.tradeStock("XOM", "150");
        stockMarket.tradeStock("JPM", "90");
        stockMarket.tradeStock("XOM", "200");

        // Display updated stocks
        System.out.println("\nUpdated Stocks:");
        stockMarket.displayStocks();

        // Remove a stock
        stockMarket.removeStock("AAPL");
        System.out.println("\nAfter Removing AAPL:");
        stockMarket.displayStocks();

        System.out.println("============Main Execution End===================");
   
    }
}



