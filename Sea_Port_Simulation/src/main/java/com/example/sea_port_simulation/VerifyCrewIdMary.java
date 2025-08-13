package com.example.sea_port_simulation;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class VerifyCrewIdMary {
    private String badgeId;
    private String crewId;
    private String accessZone;
    private boolean authorized;

    public VerifyCrewIdMary(String badgeId, String crewId, String accessZone, boolean authorized) {
        this.badgeId = badgeId;
        this.crewId = crewId;
        this.accessZone = accessZone;
        this.authorized = authorized;
    }

    public static ObservableList<VerifyCrewIdMary> getDummyScan() {
        return null;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    public String getCrewId() {
        return crewId;
    }

    public void setCrewId(String crewId) {
        this.crewId = crewId;
    }

    public String getAccessZone() {
        return accessZone;
    }

    public void setAccessZone(String accessZone) {
        this.accessZone = accessZone;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    @Override
    public String toString() {
        return "VerifyCrewIdMary{" +
                "badgeId='" + badgeId + '\'' +
                ", crewId='" + crewId + '\'' +
                ", accessZone='" + accessZone + '\'' +
                ", authorized=" + authorized +
                '}';
    }
}
