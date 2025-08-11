package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;
import java.time.LocalDate;

public class CargoManager5Model implements Serializable {
    private String CargoId;
    private String Location;
    private LocalDate Date;
    private String Status;

    public CargoManager5Model(String cargoId, LocalDate date, String location, String status) {
        CargoId = cargoId;
        Date = date;
        Location = location;
        Status = status;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "CargoManager5Model{" +
                "CargoId='" + CargoId + '\'' +
                ", Location='" + Location + '\'' +
                ", Date=" + Date +
                ", Status='" + Status + '\'' +
                '}';
    }
}
