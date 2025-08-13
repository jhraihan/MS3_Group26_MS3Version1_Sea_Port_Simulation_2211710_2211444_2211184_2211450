package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;

public class CustomClearanceOfficer3Model implements Serializable {
    private String EnterCargoId;
    private String OfficerId;
    private String ImporterName;
    private String ExporterName;
    private String TaxPaidNo;
    private String HsCode;
    private String CustomEntryNum;

    public CustomClearanceOfficer3Model(String enterCargoId, String officerId, String importerName, String exporterName, String taxPaidNo, String hsCode, String customEntryNum) {
        EnterCargoId = enterCargoId;
        OfficerId = officerId;
        ImporterName = importerName;
        ExporterName = exporterName;
        TaxPaidNo = taxPaidNo;
        HsCode = hsCode;
        CustomEntryNum = customEntryNum;
    }

    public String getEnterCargoId() {
        return EnterCargoId;
    }

    public void setEnterCargoId(String enterCargoId) {
        EnterCargoId = enterCargoId;
    }

    public String getOfficerId() {
        return OfficerId;
    }

    public void setOfficerId(String officerId) {
        OfficerId = officerId;
    }

    public String getImporterName() {
        return ImporterName;
    }

    public void setImporterName(String importerName) {
        ImporterName = importerName;
    }

    public String getExporterName() {
        return ExporterName;
    }

    public void setExporterName(String exporterName) {
        ExporterName = exporterName;
    }

    public String getHsCode() {
        return HsCode;
    }

    public void setHsCode(String hsCode) {
        HsCode = hsCode;
    }

    public String getCustomEntryNum() {
        return CustomEntryNum;
    }

    public void setCustomEntryNum(String customEntryNum) {
        CustomEntryNum = customEntryNum;
    }

    public String getTaxPaidNo() {
        return TaxPaidNo;
    }

    public void setTaxPaidNo(String taxPaidNo) {
        TaxPaidNo = taxPaidNo;
    }

    @Override
    public String toString() {
        return "CustomClearanceOfficer3Model{" +
                "EnterCargoId='" + EnterCargoId + '\'' +
                ", OfficerId='" + OfficerId + '\'' +
                ", ImporterName='" + ImporterName + '\'' +
                ", ExporterName='" + ExporterName + '\'' +
                ", TaxPaidNo='" + TaxPaidNo + '\'' +
                ", HsCode='" + HsCode + '\'' +
                ", CustomEntryNum='" + CustomEntryNum + '\'' +
                '}';
    }
}
