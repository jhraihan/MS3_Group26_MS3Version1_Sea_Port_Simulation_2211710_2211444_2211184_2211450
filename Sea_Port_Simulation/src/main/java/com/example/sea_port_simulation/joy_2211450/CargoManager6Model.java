package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;
import java.time.LocalDate;

public class CargoManager6Model implements Serializable {
    private String CargoId;
    private LocalDate ExpiryDate;
    private String ExpiredList;

    public CargoManager6Model(String cargoId, LocalDate expiryDate, String expiredList) {
        CargoId = cargoId;
        ExpiryDate = expiryDate;
        ExpiredList = expiredList;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        ExpiryDate = expiryDate;
    }

    public String getExpiredList() {
        return ExpiredList;
    }

    public void setExpiredList(String expiredList) {
        ExpiredList = expiredList;
    }

    @Override
    public String toString() {
        return "CargoManager6Model{" +
                "CargoId='" + CargoId + '\'' +
                ", ExpiryDate=" + ExpiryDate +
                ", ExpiredList='" + ExpiredList + '\'' +
                '}';
    }
}
