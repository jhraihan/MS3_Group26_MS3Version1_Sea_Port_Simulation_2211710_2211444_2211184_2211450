package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CargoManager8Model implements Serializable {
    private String cargoId;
    private String EnterRemark;
    private String Status;

    public CargoManager8Model(String cargoId, String enterRemark, String status) {
        this.cargoId = cargoId;
        EnterRemark = enterRemark;
        Status = status;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public String getEnterRemark() {
        return EnterRemark;
    }

    public void setEnterRemark(String enterRemark) {
        EnterRemark = enterRemark;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "CargoManager8Model{" +
                "cargoId='" + cargoId + '\'' +
                ", EnterRemark='" + EnterRemark + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
