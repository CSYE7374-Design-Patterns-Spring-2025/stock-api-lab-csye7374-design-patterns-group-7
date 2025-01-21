package edu.neu.csye7374;

/**
 * 
 * @author Pooja Kulkarni
 * 
 */

public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        //your driver code here
        StockSingleton stock = StockSingleton.getInstance();
        
        Stock apple = new APPL("APPL", 156.2, "Apple Stock");
        Stock nvdia = new NVDA("NVDA", 555, "Nvdia Stock");
        Stock paloalto = new PANW("PANW", 122.2, "Palo Alto Networks Stock");
        Stock coscto = new COST("COST", 352, "Costco Stock");
        Stock tesla = new TSLA("TSLA", 555, "Tesla Stock");

        stock.addStock(nvdia);
        stock.addStock(apple);
        stock.addStock(paloalto);
        stock.addStock(coscto);
        stock.addStock(tesla);
        
        System.out.println("Initial state:");
        stock.showAllStocks();
        System.out.println();
        double[] bids = {140, 145, 150, 155, 160,165};
        for (double bid : bids) {
            System.out.println("Placing bid: " + bid);
            stock.tradeStock("APPL", bid);
            stock.tradeStock("NVDA", bid);
            stock.tradeStock("PANW", bid);
            stock.tradeStock("COST", bid);
            stock.tradeStock("TSLA", bid);
        }
        
        System.out.println("\nFinal state:");
        stock.showAllStocks();
        
        System.out.println("\nRemoving one stock");
        stock.removeStock("PANW");
        stock.showAllStocks();
        System.out.println("============Main Execution End===================");
   
    }
}



