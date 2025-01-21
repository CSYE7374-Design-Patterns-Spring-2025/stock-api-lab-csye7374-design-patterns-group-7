package edu.neu.csye7374;

public interface Tradable0 extends Tradable {
	default void setBid(double bid) {
		System.out.println("This is default bid present in Tradable0" + bid);
	}
	
	double getMetric();
}
