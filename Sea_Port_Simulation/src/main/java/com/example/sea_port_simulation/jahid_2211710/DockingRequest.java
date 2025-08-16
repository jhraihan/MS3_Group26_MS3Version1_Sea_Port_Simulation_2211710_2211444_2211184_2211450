package com.example.sea_port_simulation.jahid_2211710;

import java.time.LocalDate;

public class DockingRequest {
    private int requestID,shipID;
    private String shipName,shipSize,cargoType,priorityLevel,requestedDock,specialRequirements;
    private LocalDate ETADate,ETATime;

    public DockingRequest(int requestID, int shipID, String shipName, String shipSize, String cargoType, String priorityLevel, String requestedDock, String specialRequirements, LocalDate ETADate, LocalDate ETATime) {
        this.requestID = requestID;
        this.shipID = shipID;
        this.shipName = shipName;
        this.shipSize = shipSize;
        this.cargoType = cargoType;
        this.priorityLevel = priorityLevel;
        this.requestedDock = requestedDock;
        this.specialRequirements = specialRequirements;
        this.ETADate = ETADate;
        this.ETATime = ETATime;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getShipID() {
        return shipID;
    }

    public void setShipID(int shipID) {
        this.shipID = shipID;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipSize() {
        return shipSize;
    }

    public void setShipSize(String shipSize) {
        this.shipSize = shipSize;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getRequestedDock() {
        return requestedDock;
    }

    public void setRequestedDock(String requestedDock) {
        this.requestedDock = requestedDock;
    }

    public String getSpecialRequirements() {
        return specialRequirements;
    }

    public void setSpecialRequirements(String specialRequirements) {
        this.specialRequirements = specialRequirements;
    }

    public LocalDate getETADate() {
        return ETADate;
    }

    public void setETADate(LocalDate ETADate) {
        this.ETADate = ETADate;
    }

    public LocalDate getETATime() {
        return ETATime;
    }

    public void setETATime(LocalDate ETATime) {
        this.ETATime = ETATime;
    }

    @Override
    public String toString() {
        return "DockingRequest{" +
                "requestID=" + requestID +
                ", shipID=" + shipID +
                ", shipName='" + shipName + '\'' +
                ", shipSize='" + shipSize + '\'' +
                ", cargoType='" + cargoType + '\'' +
                ", priorityLevel='" + priorityLevel + '\'' +
                ", requestedDock='" + requestedDock + '\'' +
                ", specialRequirements='" + specialRequirements + '\'' +
                ", ETADate=" + ETADate +
                ", ETATime=" + ETATime +
                '}';
    }
}
