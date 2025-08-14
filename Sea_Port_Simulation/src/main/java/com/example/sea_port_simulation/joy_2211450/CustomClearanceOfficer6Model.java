package com.example.sea_port_simulation.joy_2211450;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomClearanceOfficer6Model implements Serializable {
    private String Name;
    private String Id;
    private String Address;
    private String CompanyName;
    private String country;
    private LocalDate RegDate;

    public CustomClearanceOfficer6Model(String name, String id, String address, String companyName, String country, LocalDate regDate) {
        Name = name;
        Id = id;
        Address = address;
        CompanyName = companyName;
        this.country = country;
        RegDate = regDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getRegDate() {
        return RegDate;
    }

    public void setRegDate(LocalDate regDate) {
        RegDate = regDate;
    }

    @Override
    public String toString() {
        return "CustomClearanceOfficer6Model{" +
                "Name='" + Name + '\'' +
                ", Id='" + Id + '\'' +
                ", Address='" + Address + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", country='" + country + '\'' +
                ", RegDate=" + RegDate +
                '}';
    }
}
