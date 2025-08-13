package com.example.sea_port_simulation;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class RestrictedZonesMary {
    private String zoneId;
    private String areaName;
    private int requiredAccessLevel;
    private boolean active;

    public RestrictedZonesMary(String zoneId, String areaName, int requiredAccessLevel, boolean active) {
        this.zoneId = zoneId;
        this.areaName = areaName;
        this.requiredAccessLevel = requiredAccessLevel;
        this.active = active;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getRequiredAccessLevel() {
        return requiredAccessLevel;
    }

    public void setRequiredAccessLevel(int requiredAccessLevel) {
        this.requiredAccessLevel = requiredAccessLevel;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "RestrictedZonesMary{" +
                "zoneId='" + zoneId + '\'' +
                ", areaName='" + areaName + '\'' +
                ", requiredAccessLevel=" + requiredAccessLevel +
                ", active=" + active +
                '}';
    }
}
