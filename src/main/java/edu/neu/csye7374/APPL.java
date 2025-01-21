package edu.neu.csye7374;

public class APPL extends Stock implements Tradable0 {

	public APPL(String name, double price, String description) {
		super("APPL", price, "Apple Stock");
		
	}

	@Override
	public double getMetric() {
		// TODO Auto-generated method stub
		return (getPrice() * 1.3);
	}

}
