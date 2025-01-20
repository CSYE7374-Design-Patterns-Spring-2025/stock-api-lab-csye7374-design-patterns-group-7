package edu.neu.csye7374;

public class FinanceStock extends Stock {
    private double metric;

    public FinanceStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        setPrice(getPrice() + bidValue * 0.03); // Price increases by 3% of bid
        metric = getPrice() * 0.01; // Metric calculation
    }

    @Override
    public String getMetric() {
        return "Finance Stock Metric: " + metric;
    }
}
