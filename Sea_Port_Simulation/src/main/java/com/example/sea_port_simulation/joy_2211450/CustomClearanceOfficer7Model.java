package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CustomClearanceOfficer7Model implements Serializable {
    private String CargoId;
    private String OfficerId;
    private String OfficerName;
    private String OfficerNum;
    private String CustomNote;
    private String Status;
    private String RiskLevel;

    public CustomClearanceOfficer7Model(String cargoId, String officerId, String officerName, String officerNum, String customNote, String status, String riskLevel) {
        CargoId = cargoId;
        OfficerId = officerId;
        OfficerName = officerName;
        OfficerNum = officerNum;
        CustomNote = customNote;
        Status = status;
        RiskLevel = riskLevel;
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

    public String getOfficerNum() {
        return OfficerNum;
    }

    public void setOfficerNum(String officerNum) {
        OfficerNum = officerNum;
    }

    public String getCustomNote() {
        return CustomNote;
    }

    public void setCustomNote(String customNote) {
        CustomNote = customNote;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRiskLevel() {
        return RiskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        RiskLevel = riskLevel;
    }

    @Override
    public String toString() {
        return "CustomClearanceOfficer7Model{" +
                "CargoId='" + CargoId + '\'' +
                ", OfficerId='" + OfficerId + '\'' +
                ", OfficerName='" + OfficerName + '\'' +
                ", OfficerNum='" + OfficerNum + '\'' +
                ", CustomNote='" + CustomNote + '\'' +
                ", Status='" + Status + '\'' +
                ", RiskLevel='" + RiskLevel + '\'' +
                '}';
    }
}
