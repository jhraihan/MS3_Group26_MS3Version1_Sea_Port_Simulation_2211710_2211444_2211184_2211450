package com.example.sea_port_simulation;

public class AuditLogsMary {
    private String dateRange;
    private int entryCount;
    private int alertCount;
    private int zoneBreaches;

    public AuditLogsMary(String dateRange, int entryCount, int alertCount, int zoneBreaches) {
        this.dateRange = dateRange;
        this.entryCount = entryCount;
        this.alertCount = alertCount;
        this.zoneBreaches = zoneBreaches;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public int getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(int entryCount) {
        this.entryCount = entryCount;
    }

    public int getAlertCount() {
        return alertCount;
    }

    public void setAlertCount(int alertCount) {
        this.alertCount = alertCount;
    }

    public int getZoneBreaches() {
        return zoneBreaches;
    }

    public void setZoneBreaches(int zoneBreaches) {
        this.zoneBreaches = zoneBreaches;
    }

    @Override
    public String toString() {
        return "AuditLogsMary{" +
                "dateRange='" + dateRange + '\'' +
                ", entryCount=" + entryCount +
                ", alertCount=" + alertCount +
                ", zoneBreaches=" + zoneBreaches +
                '}';
    }
}
