package com.example.sea_port_simulation.Nasir_2211444;

import java.time.LocalDate;

public class UpdateTask {
    private String ShipID;
    private LocalDate Date;
    private String TaskStatus;
    private String PilotID;

    public UpdateTask(String shipID, LocalDate date, String taskStatus, String pilotID) {
        ShipID = shipID;
        Date = date;
        TaskStatus = taskStatus;
        PilotID = pilotID;
    }

    public String getShipID() {
        return ShipID;
    }

    public void setShipID(String shipID) {
        ShipID = shipID;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        TaskStatus = taskStatus;
    }

    public String getPilotID() {
        return PilotID;
    }

    public void setPilotID(String pilotID) {
        PilotID = pilotID;
    }

    @Override
    public String toString() {
        return "UpdateTask{" +
                "ShipID='" + ShipID + '\'' +
                ", Date=" + Date +
                ", TaskStatus='" + TaskStatus + '\'' +
                ", PilotID='" + PilotID + '\'' +
                '}';
    }
}
