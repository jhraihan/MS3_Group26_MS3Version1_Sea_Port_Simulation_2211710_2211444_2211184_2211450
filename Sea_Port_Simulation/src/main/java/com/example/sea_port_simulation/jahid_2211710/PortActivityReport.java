package com.example.sea_port_simulation.jahid_2211710;

import java.time.LocalDate;

public class PortActivityReport {
    private String reportID;
    private String reportType;
    private LocalDate dateRange,endDate,startDate;
    private LocalDate generatedOn;
    private String generatedBy;
    private String totalShipHandled;
    private String totalCargoVolume;
    private String averageTurnAroundTime;
    private String delayIncident;

    public PortActivityReport(String reportID, String reportType, LocalDate dateRange, LocalDate endDate, LocalDate startDate, LocalDate generatedOn, String generatedBy, String totalShipHandled, String totalCargoVolume, String averageTurnAroundTime, String delayIncident) {
        this.reportID = reportID;
        this.reportType = reportType;
        this.dateRange = dateRange;
        this.endDate = endDate;
        this.startDate = startDate;
        this.generatedOn = generatedOn;
        this.generatedBy = generatedBy;
        this.totalShipHandled = totalShipHandled;
        this.totalCargoVolume = totalCargoVolume;
        this.averageTurnAroundTime = averageTurnAroundTime;
        this.delayIncident = delayIncident;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public LocalDate getDateRange() {
        return dateRange;
    }

    public void setDateRange(LocalDate dateRange) {
        this.dateRange = dateRange;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getGeneratedOn() {
        return generatedOn;
    }

    public void setGeneratedOn(LocalDate generatedOn) {
        this.generatedOn = generatedOn;
    }

    public String getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    public String getTotalShipHandled() {
        return totalShipHandled;
    }

    public void setTotalShipHandled(String totalShipHandled) {
        this.totalShipHandled = totalShipHandled;
    }

    public String getTotalCargoVolume() {
        return totalCargoVolume;
    }

    public void setTotalCargoVolume(String totalCargoVolume) {
        this.totalCargoVolume = totalCargoVolume;
    }

    public String getAverageTurnAroundTime() {
        return averageTurnAroundTime;
    }

    public void setAverageTurnAroundTime(String averageTurnAroundTime) {
        this.averageTurnAroundTime = averageTurnAroundTime;
    }

    public String getDelayIncident() {
        return delayIncident;
    }

    public void setDelayIncident(String delayIncident) {
        this.delayIncident = delayIncident;
    }

    @Override
    public String toString() {
        return "PortActivityReport{" +
                "reportID='" + reportID + '\'' +
                ", reportType='" + reportType + '\'' +
                ", dateRange=" + dateRange +
                ", endDate=" + endDate +
                ", startDate=" + startDate +
                ", generatedOn=" + generatedOn +
                ", generatedBy='" + generatedBy + '\'' +
                ", totalShipHandled='" + totalShipHandled + '\'' +
                ", totalCargoVolume='" + totalCargoVolume + '\'' +
                ", averageTurnAroundTime='" + averageTurnAroundTime + '\'' +
                ", delayIncident='" + delayIncident + '\'' +
                '}';
    }
}
