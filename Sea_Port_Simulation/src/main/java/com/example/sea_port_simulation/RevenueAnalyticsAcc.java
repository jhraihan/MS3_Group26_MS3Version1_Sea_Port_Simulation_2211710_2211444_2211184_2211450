package com.example.sea_port_simulation;

public class RevenueAnalyticsAcc {
    private String month;
    private String category;
    private Double amount;

    public RevenueAnalyticsAcc(String month, String category, Double amount) {
        this.month = month;
        this.category = category;
        this.amount = amount;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RevenueAnalyticsAcc{" +
                "month='" + month + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}
