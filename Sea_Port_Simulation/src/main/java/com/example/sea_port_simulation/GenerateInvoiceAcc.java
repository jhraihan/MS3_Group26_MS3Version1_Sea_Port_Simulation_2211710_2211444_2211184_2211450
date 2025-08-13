package com.example.sea_port_simulation;

public class GenerateInvoiceAcc {
    private String invoiceId;
    private String shipId;
    private Double berthRent;
    private Double serviceCharge;
    private Double tax;
    private Double total;

    public GenerateInvoiceAcc(String invoiceId, String shipId, Double berthRent, Double serviceCharge, Double tax, Double total) {
        this.invoiceId = invoiceId;
        this.shipId = shipId;
        this.berthRent = berthRent;
        this.serviceCharge = serviceCharge;
        this.tax = tax;
        this.total = total;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public Double getBerthRent() {
        return berthRent;
    }

    public void setBerthRent(Double berthRent) {
        this.berthRent = berthRent;
    }

    public Double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "GenerateInvoiceAcc{" +
                "invoiceId='" + invoiceId + '\'' +
                ", shipId='" + shipId + '\'' +
                ", berthRent=" + berthRent +
                ", serviceCharge=" + serviceCharge +
                ", tax=" + tax +
                ", total=" + total +
                '}';
    }
}
