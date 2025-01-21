package edu.neu.csye7374;
import java.util.*;

public abstract class Stock {
	private String name;
	private double price;
	private String description;
	private List<Double> bids = new ArrayList<>();
	
	public Stock(String name, double price, String description) {
		super();
		this.setName(name);
		this.setPrice(price);
		this.description = description;
	}
	
	public void calculateAndTradeBids(double bid) {
		bids.add(bid);
		this.setPrice(this.getPrice() + (bid - this.getPrice()) * 0.5);
	}

	@Override
	public String toString() {
		return "Stock [name=" + getName() + ", price=" + getPrice() + ", description=" + description + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
