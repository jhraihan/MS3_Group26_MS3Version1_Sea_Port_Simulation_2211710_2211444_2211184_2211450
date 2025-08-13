package com.example.sea_port_simulation;

public class OverdueAccountsAcc {
    private String clientName;
    private int overdueDays;
    private Double dueAmount;
    private String lastInvoiceId;

    public OverdueAccountsAcc(String clientName, int overdueDays, Double dueAmount, String lastInvoiceId) {
        this.clientName = clientName;
        this.overdueDays = overdueDays;
        this.dueAmount = dueAmount;
        this.lastInvoiceId = lastInvoiceId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getLastInvoiceId() {
        return lastInvoiceId;
    }

    public void setLastInvoiceId(String lastInvoiceId) {
        this.lastInvoiceId = lastInvoiceId;
    }

    @Override
    public String toString() {
        return "OverdueAccountsAcc{" +
                "clientName='" + clientName + '\'' +
                ", overdueDays=" + overdueDays +
                ", dueAmount=" + dueAmount +
                ", lastInvoiceId='" + lastInvoiceId + '\'' +
                '}';
    }
}
