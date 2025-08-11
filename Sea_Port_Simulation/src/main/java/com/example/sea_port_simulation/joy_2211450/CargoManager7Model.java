package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CargoManager7Model implements Serializable {
    private String CargoId;
    private String ExpectedTime;
    private String Status;
    private String Location;
    private String ValidateTime;

    public CargoManager7Model(String cargoId, String expectedTime, String status, String location, String validateTime) {
        CargoId = cargoId;
        ExpectedTime = expectedTime;
        Status = status;
        Location = location;
        ValidateTime = validateTime;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public String getValidateTime() {
        return ValidateTime;
    }

    public void setValidateTime(String validateTime) {
        ValidateTime = validateTime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getExpectedTime() {
        return ExpectedTime;
    }

    public void setExpectedTime(String expectedTime) {
        ExpectedTime = expectedTime;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "CargoManager7Model{" +
                "CargoId='" + CargoId + '\'' +
                ", ExpectedTime='" + ExpectedTime + '\'' +
                ", Status='" + Status + '\'' +
                ", Location='" + Location + '\'' +
                ", ValidateTime='" + ValidateTime + '\'' +
                '}';
    }
}
