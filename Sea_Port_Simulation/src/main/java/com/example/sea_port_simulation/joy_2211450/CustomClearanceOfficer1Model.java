package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomClearanceOfficer1Model implements Serializable {
    private String Name;
    private String LicenceNumber;
    private String Address;
    private String PhNum;
    private String Country;
    private LocalDate DateOgRegister;

    public CustomClearanceOfficer1Model(String name, String licenceNumber, String address, String phNum, String country, LocalDate dateOgRegister) {
        Name = name;
        LicenceNumber = licenceNumber;
        Address = address;
        PhNum = phNum;
        Country = country;
        DateOgRegister = dateOgRegister;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLicenceNumber() {
        return LicenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        LicenceNumber = licenceNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhNum() {
        return PhNum;
    }

    public void setPhNum(String phNum) {
        PhNum = phNum;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public LocalDate getDateOgRegister() {
        return DateOgRegister;
    }

    public void setDateOgRegister(LocalDate dateOgRegister) {
        DateOgRegister = dateOgRegister;
    }

    @Override
    public String toString() {
        return "CustomClearanceOfficer1Model{" +
                "Name='" + Name + '\'' +
                ", LicenceNumber='" + LicenceNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", PhNum='" + PhNum + '\'' +
                ", Country='" + Country + '\'' +
                ", DateOgRegister=" + DateOgRegister +
                '}';
    }
}
