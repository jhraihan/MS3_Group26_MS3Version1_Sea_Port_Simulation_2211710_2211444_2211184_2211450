package com.example.sea_port_simulation.Nasir_2211444;

import java.time.LocalDate;

public class WeeklySummary {
    private String PilotID;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String NumOfAssignment;
    private String Summary;

    public WeeklySummary(String pilotID, LocalDate startDate, LocalDate endDate, String numOfAssignment, String summary) {
        PilotID = pilotID;
        StartDate = startDate;
        EndDate = endDate;
        NumOfAssignment = numOfAssignment;
        Summary = summary;
    }

    public String getPilotID() {
        return PilotID;
    }

    public void setPilotID(String pilotID) {
        PilotID = pilotID;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public String getNumOfAssignment() {
        return NumOfAssignment;
    }

    public void setNumOfAssignment(String numOfAssignment) {
        NumOfAssignment = numOfAssignment;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    @Override
    public String toString() {
        return "WeeklySummary{" +
                "PilotID='" + PilotID + '\'' +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", NumOfAssignment='" + NumOfAssignment + '\'' +
                ", Summary='" + Summary + '\'' +
                '}';
    }
}
