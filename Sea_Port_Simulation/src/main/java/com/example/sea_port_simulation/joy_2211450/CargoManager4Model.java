package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;
import java.time.LocalDate;

public class CargoManager4Model implements Serializable {
    private String CargoId;
    private String Location;
    private LocalDate Date;
    private String Status;

    public CargoManager4Model(String cargoId, String location, LocalDate date, String status) {
        CargoId = cargoId;
        Location = location;
        Date = date;
        Status = status;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "CargoManager4Model{" +
                "CargoId='" + CargoId + '\'' +
                ", Location='" + Location + '\'' +
                ", Date=" + Date +
                ", Status='" + Status + '\'' +
                '}';
    }
}
