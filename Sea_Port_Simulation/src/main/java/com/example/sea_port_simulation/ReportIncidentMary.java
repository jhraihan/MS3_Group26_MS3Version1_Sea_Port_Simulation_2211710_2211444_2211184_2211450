package com.example.sea_port_simulation;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;

public class ReportIncidentMary {
    private String incidentId;
    private String description;
    private String zone;
    private String reportedTime;
    private boolean alertSent;
    private String snapshotPath;

    public ReportIncidentMary(String incidentId, String description, String zone, String reportedTime, boolean alertSent, String snapshotPath) {
        this.incidentId = incidentId;
        this.description = description;
        this.zone = zone;
        this.reportedTime = reportedTime;
        this.alertSent = alertSent;
        this.snapshotPath = snapshotPath;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getReportedTime() {
        return reportedTime;
    }

    public void setReportedTime(String reportedTime) {
        this.reportedTime = reportedTime;
    }

    public boolean isAlertSent() {
        return alertSent;
    }

    public void setAlertSent(boolean alertSent) {
        this.alertSent = alertSent;
    }

    public String getSnapshotPath() {
        return snapshotPath;
    }

    public void setSnapshotPath(String snapshotPath) {
        this.snapshotPath = snapshotPath;
    }

    @Override
    public String toString() {
        return "ReportIncidentMary{" +
                "incidentId='" + incidentId + '\'' +
                ", description='" + description + '\'' +
                ", zone='" + zone + '\'' +
                ", reportedTime='" + reportedTime + '\'' +
                ", alertSent=" + alertSent +
                ", snapshotPath='" + snapshotPath + '\'' +
                '}';
    }
}
