package com.example.sea_port_simulation;

public class TariffSettingsAcc {
    private Double baseDockingRate;
    private Double serviceSurcharge;
    private Double taxPercentage;
    private String effectiveFrom;

    public TariffSettingsAcc(Double baseDockingRate, Double serviceSurcharge, Double taxPercentage, String effectiveFrom) {
        this.baseDockingRate = baseDockingRate;
        this.serviceSurcharge = serviceSurcharge;
        this.taxPercentage = taxPercentage;
        this.effectiveFrom = effectiveFrom;
    }

    public Double getBaseDockingRate() {
        return baseDockingRate;
    }

    public void setBaseDockingRate(Double baseDockingRate) {
        this.baseDockingRate = baseDockingRate;
    }

    public Double getServiceSurcharge() {
        return serviceSurcharge;
    }

    public void setServiceSurcharge(Double serviceSurcharge) {
        this.serviceSurcharge = serviceSurcharge;
    }

    public Double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(Double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public String getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(String effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    @Override
    public String toString() {
        return "TariffSettingsAcc{" +
                "baseDockingRate=" + baseDockingRate +
                ", serviceSurcharge=" + serviceSurcharge +
                ", taxPercentage=" + taxPercentage +
                ", effectiveFrom='" + effectiveFrom + '\'' +
                '}';
    }
}
