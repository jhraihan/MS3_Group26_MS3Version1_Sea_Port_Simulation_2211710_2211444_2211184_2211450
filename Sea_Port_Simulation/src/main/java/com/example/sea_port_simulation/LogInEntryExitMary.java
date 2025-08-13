package com.example.sea_port_simulation;

public class LogInEntryExitMary {
    private String timestamp;
    private String shipId;
    private String crewIds;
    private String gateNumber;
    private String eventType;

    public LogInEntryExitMary(String timestamp, String shipId, String crewIds, String gateNumber, String eventType) {
        this.timestamp = timestamp;
        this.shipId = shipId;
        this.crewIds = crewIds;
        this.gateNumber = gateNumber;
        this.eventType = eventType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public String getCrewIds() {
        return crewIds;
    }

    public void setCrewIds(String crewIds) {
        this.crewIds = crewIds;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "LogInEntryExitMary{" +
                "timestamp='" + timestamp + '\'' +
                ", shipId='" + shipId + '\'' +
                ", crewIds='" + crewIds + '\'' +
                ", gateNumber='" + gateNumber + '\'' +
                ", eventType='" + eventType + '\'' +
                '}';
    }
}
