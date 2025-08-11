package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CargoManager2Model implements Serializable {
    private String CargoId;
    private String departureTime;

    public CargoManager2Model(String departureTime, String cargoId) {
        this.departureTime = departureTime;
        CargoId = cargoId;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "CargoManager2Model{" +
                "CargoId='" + CargoId + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
