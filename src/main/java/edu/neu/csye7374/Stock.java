package edu.neu.csye7374;

public abstract class Stock implements Tradable0, Tradable1 {
    private String name;
    private double price;
    private String description;

    public Stock(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("Stock{name='%s', price=%.2f, description='%s'}", name, price, description);
    }
}
