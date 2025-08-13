package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CustomClearanceOfficer4Model implements Serializable {
    private String CargoId;
    private String OfficerId;
    private String Reason;

    public CustomClearanceOfficer4Model(String cargoId, String officerId, String reason) {
        CargoId = cargoId;
        OfficerId = officerId;
        Reason = reason;
    }

    public String getCargoId() {
        return CargoId;
    }

    public void setCargoId(String cargoId) {
        CargoId = cargoId;
    }

    public String getOfficerId() {
        return OfficerId;
    }

    public void setOfficerId(String officerId) {
        OfficerId = officerId;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    @Override
    public String toString() {
        return "CustomClearanceOfficer4Model{" +
                "CargoId='" + CargoId + '\'' +
                ", OfficerId='" + OfficerId + '\'' +
                ", Reason='" + Reason + '\'' +
                '}';
    }
}
