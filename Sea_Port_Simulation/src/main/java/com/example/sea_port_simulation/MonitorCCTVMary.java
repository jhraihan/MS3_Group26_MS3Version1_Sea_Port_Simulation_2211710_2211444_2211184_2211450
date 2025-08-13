package com.example.sea_port_simulation;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MonitorCCTVMary {
    private String cameraId;
    private String location;
    private String status;

    public MonitorCCTVMary(String cameraId, String location, String status) {
        this.cameraId = cameraId;
        this.location = location;
        this.status = status;
    }

    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MonitorCCTVMary{" +
                "cameraId='" + cameraId + '\'' +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
