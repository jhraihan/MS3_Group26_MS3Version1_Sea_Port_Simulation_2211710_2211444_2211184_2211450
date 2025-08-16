package com.example.sea_port_simulation.jahid_2211710;

import java.time.LocalDate;

public class DepartureRequest {
    private int requestID,shipID;
    private String shipName,currentDockLocation,departureType,customerClearanceStatus,tugboatAssitanceRequired,nextDestinationPort;
    private LocalDate requestedDepartureDate,requestedDepurtureTime;

    public DepartureRequest(int requestID, int shipID, String shipName, String currentDockLocation, String departureType, String customerClearanceStatus, String tugboatAssitanceRequired, String nextDestinationPort, LocalDate requestedDepartureDate, LocalDate requestedDepurtureTime) {
        this.requestID = requestID;
        this.shipID = shipID;
        this.shipName = shipName;
        this.currentDockLocation = currentDockLocation;
        this.departureType = departureType;
        this.customerClearanceStatus = customerClearanceStatus;
        this.tugboatAssitanceRequired = tugboatAssitanceRequired;
        this.nextDestinationPort = nextDestinationPort;
        this.requestedDepartureDate = requestedDepartureDate;
        this.requestedDepurtureTime = requestedDepurtureTime;
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

    public String getCurrentDockLocation() {
        return currentDockLocation;
    }

    public void setCurrentDockLocation(String currentDockLocation) {
        this.currentDockLocation = currentDockLocation;
    }

    public String getDepartureType() {
        return departureType;
    }

    public void setDepartureType(String departureType) {
        this.departureType = departureType;
    }

    public String getCustomerClearanceStatus() {
        return customerClearanceStatus;
    }

    public void setCustomerClearanceStatus(String customerClearanceStatus) {
        this.customerClearanceStatus = customerClearanceStatus;
    }

    public String getTugboatAssitanceRequired() {
        return tugboatAssitanceRequired;
    }

    public void setTugboatAssitanceRequired(String tugboatAssitanceRequired) {
        this.tugboatAssitanceRequired = tugboatAssitanceRequired;
    }

    public String getNextDestinationPort() {
        return nextDestinationPort;
    }

    public void setNextDestinationPort(String nextDestinationPort) {
        this.nextDestinationPort = nextDestinationPort;
    }

    public LocalDate getRequestedDepartureDate() {
        return requestedDepartureDate;
    }

    public void setRequestedDepartureDate(LocalDate requestedDepartureDate) {
        this.requestedDepartureDate = requestedDepartureDate;
    }

    public LocalDate getRequestedDepurtureTime() {
        return requestedDepurtureTime;
    }

    public void setRequestedDepurtureTime(LocalDate requestedDepurtureTime) {
        this.requestedDepurtureTime = requestedDepurtureTime;
    }

    @Override
    public String toString() {
        return "DepartureRequest{" +
                "requestID=" + requestID +
                ", shipID=" + shipID +
                ", shipName='" + shipName + '\'' +
                ", currentDockLocation='" + currentDockLocation + '\'' +
                ", departureType='" + departureType + '\'' +
                ", customerClearanceStatus='" + customerClearanceStatus + '\'' +
                ", tugboatAssitanceRequired='" + tugboatAssitanceRequired + '\'' +
                ", nextDestinationPort='" + nextDestinationPort + '\'' +
                ", requestedDepartureDate=" + requestedDepartureDate +
                ", requestedDepurtureTime=" + requestedDepurtureTime +
                '}';
    }
}
