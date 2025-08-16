package com.example.sea_port_simulation.jahid_2211710;

import java.time.LocalDate;

public class PortFee {
    private int feeID;
    private String feeType,rateCatagory,baseAmount,applicableVesselSize,description,currency;
    private LocalDate effectiveDate,expiryDate;
    private boolean taxIncluded;

    public PortFee(int feeID, String feeType, String rateCatagory, String baseAmount, String applicableVesselSize, String description, String currency, LocalDate effectiveDate, LocalDate expiryDate, boolean taxIncluded) {
        this.feeID = feeID;
        this.feeType = feeType;
        this.rateCatagory = rateCatagory;
        this.baseAmount = baseAmount;
        this.applicableVesselSize = applicableVesselSize;
        this.description = description;
        this.currency = currency;
        this.effectiveDate = effectiveDate;
        this.expiryDate = expiryDate;
        this.taxIncluded = taxIncluded;
    }

    public int getFeeID() {
        return feeID;
    }

    public void setFeeID(int feeID) {
        this.feeID = feeID;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getRateCatagory() {
        return rateCatagory;
    }

    public void setRateCatagory(String rateCatagory) {
        this.rateCatagory = rateCatagory;
    }

    public String getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getApplicableVesselSize() {
        return applicableVesselSize;
    }

    public void setApplicableVesselSize(String applicableVesselSize) {
        this.applicableVesselSize = applicableVesselSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isTaxIncluded() {
        return taxIncluded;
    }

    public void setTaxIncluded(boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    @Override
    public String toString() {
        return "PortFee{" +
                "feeID=" + feeID +
                ", feeType='" + feeType + '\'' +
                ", rateCatagory='" + rateCatagory + '\'' +
                ", baseAmount='" + baseAmount + '\'' +
                ", applicableVesselSize='" + applicableVesselSize + '\'' +
                ", description='" + description + '\'' +
                ", currency='" + currency + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", expiryDate=" + expiryDate +
                ", taxIncluded=" + taxIncluded +
                '}';
    }
}
