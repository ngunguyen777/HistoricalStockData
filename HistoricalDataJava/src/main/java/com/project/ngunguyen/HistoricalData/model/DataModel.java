package com.project.ngunguyen.HistoricalData.model;

public class DataModel {
    private String date;
    private Double adjusted_close;
    private Double variance;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAdjusted_close() {
        return adjusted_close;
    }

    public void setAdjusted_close(Double adjusted_close) {
        this.adjusted_close = adjusted_close;
    }

    public Double getVariance() {
        return variance;
    }

    public void setVariance(Double variance) {
        this.variance = variance;
    }
}
