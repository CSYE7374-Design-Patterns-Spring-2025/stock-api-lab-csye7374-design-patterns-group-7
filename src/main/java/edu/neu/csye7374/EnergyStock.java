package edu.neu.csye7374;

public class EnergyStock extends Stock {
    private double metric;

    public EnergyStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        setPrice(getPrice() + bidValue * 0.04); // Price increases by 4% of bid
        metric = getPrice() * 0.015; // Metric calculation
    }

    @Override
    public String getMetric() {
        return "Energy Stock Metric: " + metric;
    }
}
