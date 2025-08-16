package com.example.sea_port_simulation.jahid_2211710;

import java.time.LocalDate;

public class CargoEfficiency {
    private int efficiencyID, shipID;
    private String cargoType, delayReason, delay, targetEfficiency, actualEfficiency;
    private LocalDate startTime, endTime;

    public CargoEfficiency(int efficiencyID, int shipID, String cargoType, String delayReason, String delay, String targetEfficiency, String actualEfficiency, LocalDate startTime, LocalDate endTime) {
        this.efficiencyID = efficiencyID;
        this.shipID = shipID;
        this.cargoType = cargoType;
        this.delayReason = delayReason;
        this.delay = delay;
        this.targetEfficiency = targetEfficiency;
        this.actualEfficiency = actualEfficiency;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getEfficiencyID() {
        return efficiencyID;
    }

    public void setEfficiencyID(int efficiencyID) {
        this.efficiencyID = efficiencyID;
    }

    public int getShipID() {
        return shipID;
    }

    public void setShipID(int shipID) {
        this.shipID = shipID;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getDelayReason() {
        return delayReason;
    }

    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getTargetEfficiency() {
        return targetEfficiency;
    }

    public void setTargetEfficiency(String targetEfficiency) {
        this.targetEfficiency = targetEfficiency;
    }

    public String getActualEfficiency() {
        return actualEfficiency;
    }

    public void setActualEfficiency(String actualEfficiency) {
        this.actualEfficiency = actualEfficiency;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "CargoEfficiency{" +
                "efficiencyID=" + efficiencyID +
                ", shipID=" + shipID +
                ", cargoType='" + cargoType + '\'' +
                ", delayReason='" + delayReason + '\'' +
                ", delay='" + delay + '\'' +
                ", targetEfficiency='" + targetEfficiency + '\'' +
                ", actualEfficiency='" + actualEfficiency + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}

