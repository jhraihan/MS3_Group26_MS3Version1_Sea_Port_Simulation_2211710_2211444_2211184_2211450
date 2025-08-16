package com.example.sea_port_simulation.jahid_2211710;

import java.time.LocalDate;

public class EmergencyAlert {
    private int alertID;
    private String alertType,securityLevel,location,description,reportedBy,status;
    private LocalDate timestamp;

    public EmergencyAlert(int alertID, String alertType, String securityLevel, String location, String description, String reportedBy, String status, LocalDate timestamp) {
        this.alertID = alertID;
        this.alertType = alertType;
        this.securityLevel = securityLevel;
        this.location = location;
        this.description = description;
        this.reportedBy = reportedBy;
        this.status = status;
        this.timestamp = timestamp;
    }

    public int getAlertID() {
        return alertID;
    }

    public void setAlertID(int alertID) {
        this.alertID = alertID;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "EmergencyAlert{" +
                "alertID=" + alertID +
                ", alertType='" + alertType + '\'' +
                ", securityLevel='" + securityLevel + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", reportedBy='" + reportedBy + '\'' +
                ", status='" + status + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
