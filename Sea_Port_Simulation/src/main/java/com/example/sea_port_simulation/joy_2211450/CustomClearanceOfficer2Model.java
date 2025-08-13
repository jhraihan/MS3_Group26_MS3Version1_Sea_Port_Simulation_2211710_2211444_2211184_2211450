package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CustomClearanceOfficer2Model implements Serializable {
    private String CargoId;
    private String Name;
    private String ShipingTime;
    private String ShipmentType;
    private String HsCode;

    public CustomClearanceOfficer2Model(String cargoId, String name, String shipingTime, String shipmentType, String hsCode) {
        CargoId = cargoId;
        Name = name;
        ShipingTime = shipingTime;
        ShipmentType = shipmentType;
        HsCode = hsCode;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShipingTime() {
        return ShipingTime;
    }

    public void setShipingTime(String shipingTime) {
        ShipingTime = shipingTime;
    }

    public String getShipmentType() {
        return ShipmentType;
    }

    public void setShipmentType(String shipmentType) {
        ShipmentType = shipmentType;
    }

    public String getHsCode() {
        return HsCode;
    }

    public void setHsCode(String hsCode) {
        HsCode = hsCode;
    }

    @Override
    public String toString() {
        return "CustomClearanceOfficer2Model{" +
                "CargoId='" + CargoId + '\'' +
                ", Name='" + Name + '\'' +
                ", ShipingTime='" + ShipingTime + '\'' +
                ", ShipmentType='" + ShipmentType + '\'' +
                ", HsCode='" + HsCode + '\'' +
                '}';
    }
}
