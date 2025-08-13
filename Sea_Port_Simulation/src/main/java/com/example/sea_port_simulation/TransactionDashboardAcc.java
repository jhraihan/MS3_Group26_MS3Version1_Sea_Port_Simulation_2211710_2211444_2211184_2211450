package com.example.sea_port_simulation;

public class TransactionDashboardAcc {
    private String transactionId;
    private String client;
    private String date;
    private String status;
    private Double amount;

    public TransactionDashboardAcc(String transactionId, String client, String date, String status, Double amount) {
        this.transactionId = transactionId;
        this.client = client;
        this.date = date;
        this.status = status;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionDashboardAcc{" +
                "transactionId='" + transactionId + '\'' +
                ", client='" + client + '\'' +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }
}
