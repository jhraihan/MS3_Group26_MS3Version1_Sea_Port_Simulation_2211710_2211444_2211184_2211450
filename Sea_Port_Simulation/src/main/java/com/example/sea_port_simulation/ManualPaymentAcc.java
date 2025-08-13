package com.example.sea_port_simulation;

public class ManualPaymentAcc {
    private String transactionId;
    private Double amount;
    private String payerName;
    private String receiptPath;
    private String date;

    public ManualPaymentAcc(String transactionId, Double amount, String payerName, String receiptPath, String date) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.payerName = payerName;
        this.receiptPath = receiptPath;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getReceiptPath() {
        return receiptPath;
    }

    public void setReceiptPath(String receiptPath) {
        this.receiptPath = receiptPath;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ManualPaymentAcc{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", payerName='" + payerName + '\'' +
                ", receiptPath='" + receiptPath + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
