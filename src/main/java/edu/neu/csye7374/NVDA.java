package edu.neu.csye7374;

public class NVDA extends Stock implements Tradable1 {

	public NVDA(String name, double price, String description) {
		super("NVDA", price, "Nvdia Stock");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getMetric() {
		// TODO Auto-generated method stub
		return (getPrice() * 1.8);
	}
	
}
