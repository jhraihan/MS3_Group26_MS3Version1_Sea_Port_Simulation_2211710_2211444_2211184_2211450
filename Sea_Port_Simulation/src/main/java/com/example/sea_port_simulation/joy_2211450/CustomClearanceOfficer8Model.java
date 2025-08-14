package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomClearanceOfficer8Model implements Serializable {
    private String CargoId;
    private String OfficerId;
    private String OfficerName;
    private String ReasonForRevocation;
    private String CargoStatus;
    private LocalDate RevocationDate;
    private LocalDate EffectiveDate;

    public CustomClearanceOfficer8Model(String cargoId, String officerName, String officerId, String reasonForRevocation, String cargoStatus, LocalDate revocationDate, LocalDate effectiveDate) {
        CargoId = cargoId;
        OfficerName = officerName;
        OfficerId = officerId;
        ReasonForRevocation = reasonForRevocation;
        CargoStatus = cargoStatus;
        RevocationDate = revocationDate;
        EffectiveDate = effectiveDate;
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

    public String getOfficerName() {
        return OfficerName;
    }

    public void setOfficerName(String officerName) {
        OfficerName = officerName;
    }

    public String getReasonForRevocation() {
        return ReasonForRevocation;
    }

    public void setReasonForRevocation(String reasonForRevocation) {
        ReasonForRevocation = reasonForRevocation;
    }

    public String getCargoStatus() {
        return CargoStatus;
    }

    public void setCargoStatus(String cargoStatus) {
        CargoStatus = cargoStatus;
    }

    public LocalDate getRevocationDate() {
        return RevocationDate;
    }

    public void setRevocationDate(LocalDate revocationDate) {
        RevocationDate = revocationDate;
    }

    public LocalDate getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        EffectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        return "CustomClearanceOfficer8Model{" +
                "CargoId='" + CargoId + '\'' +
                ", OfficerId='" + OfficerId + '\'' +
                ", OfficerName='" + OfficerName + '\'' +
                ", ReasonForRevocation='" + ReasonForRevocation + '\'' +
                ", CargoStatus='" + CargoStatus + '\'' +
                ", RevocationDate=" + RevocationDate +
                ", EffectiveDate=" + EffectiveDate +
                '}';
    }
}
