package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CargoManager3Model implements Serializable {
    private String CargoId;
    private int AvailableSlot;

    public CargoManager3Model(String cargoId, int availableSlots) {
        CargoId = cargoId;
        AvailableSlot = availableSlots;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public int getAvailableSlots() {
        return AvailableSlot;
    }

    public void setAvailableSlots(int availableSlots) {
        AvailableSlot = availableSlots;
    }

    @Override
    public String toString() {
        return "CargoManager3Model{" +
                "CargoId='" + CargoId + '\'' +
                ", AvailableSlots=" + AvailableSlot +
                '}';
    }
}
