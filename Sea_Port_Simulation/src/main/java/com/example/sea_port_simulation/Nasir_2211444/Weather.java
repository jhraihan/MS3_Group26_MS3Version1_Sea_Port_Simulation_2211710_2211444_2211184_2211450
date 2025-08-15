package com.example.sea_port_simulation.Nasir_2211444;

import java.time.LocalDate;

public class Weather {
    private LocalDate EnterDate;
    private String WorkingArea;
    private String WorkingShift;

    public Weather(LocalDate enterDate, String workingArea, String workingShift) {
        EnterDate = enterDate;
        WorkingArea = workingArea;
        WorkingShift = workingShift;
    }

    public LocalDate getEnterDate() {
        return EnterDate;
    }

    public void setEnterDate(LocalDate enterDate) {
        EnterDate = enterDate;
    }

    public String getWorkingArea() {
        return WorkingArea;
    }

    public void setWorkingArea(String workingArea) {
        WorkingArea = workingArea;
    }

    public String getWorkingShift() {
        return WorkingShift;
    }

    public void setWorkingShift(String workingShift) {
        WorkingShift = workingShift;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "EnterDate=" + EnterDate +
                ", WorkingArea='" + WorkingArea + '\'' +
                ", WorkingShift='" + WorkingShift + '\'' +
                '}';
    }
}
