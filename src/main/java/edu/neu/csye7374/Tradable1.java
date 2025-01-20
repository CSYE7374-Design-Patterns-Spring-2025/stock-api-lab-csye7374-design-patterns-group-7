package edu.neu.csye7374;

public interface Tradable1 {
    /**
     * Return a metric indicating the measure of positive performance of this stock
     * @return
     */
    default String getMetric() {
        return "Default Metric Implementation (Tradable1)";
    }
}
