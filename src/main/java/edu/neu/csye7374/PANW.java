package edu.neu.csye7374;

public class PANW extends Stock implements Tradable0 {

	public PANW(String name, double price, String description) {
		super("PANW", price, "Palo Alto Networks");
		
	}

	@Override
	public double getMetric() {
		// TODO Auto-generated method stub
		return (getPrice() * 2.3);
	} 

}
