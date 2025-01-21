package edu.neu.csye7374;

public class TSLA extends Stock implements Tradable1 {

	public TSLA(String name, double price, String description) {
		super("TSLA", price, "Tesla Stock");
		
	}

	@Override
	public double getMetric() {
		// TODO Auto-generated method stub
		return (getPrice() * 2.3);
	}

}
