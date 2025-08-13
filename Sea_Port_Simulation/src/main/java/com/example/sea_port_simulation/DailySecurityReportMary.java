package com.example.sea_port_simulation;

public class DailySecurityReportMary {
    private String reportDate;
    private int incidents;
    private String summary;
    private boolean exported;

    public DailySecurityReportMary(String reportDate, int incidents, String summary, boolean exported) {
        this.reportDate = reportDate;
        this.incidents = incidents;
        this.summary = summary;
        this.exported = exported;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public int getIncidents() {
        return incidents;
    }

    public void setIncidents(int incidents) {
        this.incidents = incidents;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isExported() {
        return exported;
    }

    public void setExported(boolean exported) {
        this.exported = exported;
    }

    @Override
    public String toString() {
        return "DailySecurityReportMary{" +
                "reportDate='" + reportDate + '\'' +
                ", incidents=" + incidents +
                ", summary='" + summary + '\'' +
                ", exported=" + exported +
                '}';
    }
}
