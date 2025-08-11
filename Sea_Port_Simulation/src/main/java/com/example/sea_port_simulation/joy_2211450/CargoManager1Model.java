package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CargoManager1Model implements Serializable {
    private String CargoId;
    private String CargoType;

    public CargoManager1Model(String cargoId, String cargoType) {
        CargoId = cargoId;
        CargoType = cargoType;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public String getCargoType() {
        return CargoType;
    }

    public void setCargoType(String cargoType) {
        CargoType = cargoType;
    }

    @Override
    public String toString() {
        return "CargoManager1Model{" +
                "CargoId='" + CargoId + '\'' +
                ", CargoType='" + CargoType + '\'' +
                '}';
    }
}
