package com.project.ngunguyen.HistoricalData.model;

public class RequestModel {
    private String start_date;
    private String end_date;
    private String ticker;

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public String toString() {
        return String.format("https://eodhistoricaldata.com/api/eod/%s?from=%s&to=%s&api_token=OeAFFmMliFG5orCUuwAKQ8l4WWFQ67YX&period=d.&fmt=json", getTicker(), getStart_date(), getEnd_date());
    }
}
