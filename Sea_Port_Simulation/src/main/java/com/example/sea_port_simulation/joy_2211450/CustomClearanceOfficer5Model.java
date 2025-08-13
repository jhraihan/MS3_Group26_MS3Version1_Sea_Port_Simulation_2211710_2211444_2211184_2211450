package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomClearanceOfficer5Model implements Serializable {
    private String CargoId;
    private String OfficerId;
    private String Reason;
    private String Status;
    private LocalDate Date;

    public CustomClearanceOfficer5Model(String cargoId, String officerId, String reason, String status, LocalDate date) {
        CargoId = cargoId;
        OfficerId = officerId;
        Reason = reason;
        Status = status;
        Date = date;
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

    @Override
    public String toString() {
        return "CustomClearanceOfficer5Model{" +
                "CargoId='" + CargoId + '\'' +
                ", OfficerId='" + OfficerId + '\'' +
                ", Reason='" + Reason + '\'' +
                ", Status='" + Status + '\'' +
                ", Date=" + Date +
                '}';
    }
}
