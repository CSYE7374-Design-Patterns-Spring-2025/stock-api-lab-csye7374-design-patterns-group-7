package edu.neu.csye7374;

public interface Tradable0 {
    /**
     * Place a bid to buy a stock
     * @param bid
     */
    default void setBid(String bid) {
        throw new UnsupportedOperationException("Default implementation not available.");
    }

    /**
     * Return a metric indicating the measure of positive performance of this stock
     * @return
     */
    default String getMetric() {
        return "Default Metric Implementation (Tradable0)";
    }
}
