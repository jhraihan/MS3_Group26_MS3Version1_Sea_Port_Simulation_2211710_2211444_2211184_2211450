package com.example.sea_port_simulation.Nasir_2211444;

import java.time.LocalDate;

public class Assignment {
    private String PilotID;
    private LocalDate TodaysDate;
    private String PilotArea;

    public Assignment(String pilotID, LocalDate todaysDate, String pilotArea) {
        PilotID = pilotID;
        TodaysDate = todaysDate;
        PilotArea = pilotArea;
    }

    public String getPilotID() {
        return PilotID;
    }

    public void setPilotID(String pilotID) {
        PilotID = pilotID;
    }

    public LocalDate getTodaysDate() {
        return TodaysDate;
    }

    public void setTodaysDate(LocalDate todaysDate) {
        TodaysDate = todaysDate;
    }

    public String getPilotArea() {
        return PilotArea;
    }

    public void setPilotArea(String pilotArea) {
        PilotArea = pilotArea;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "PilotID='" + PilotID + '\'' +
                ", TodaysDate=" + TodaysDate +
                ", PilotArea='" + PilotArea + '\'' +
                '}';
    }
}
