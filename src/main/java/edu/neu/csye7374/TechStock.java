package edu.neu.csye7374;

public class TechStock extends Stock {
    private double metric;

    public TechStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        setPrice(getPrice() + bidValue * 0.05); // Price increases by 5% of bid
        metric = getPrice() * 0.02; // Metric calculation
    }

    @Override
    public String getMetric() {
        return "Tech Stock Metric: " + metric;
    }
}
