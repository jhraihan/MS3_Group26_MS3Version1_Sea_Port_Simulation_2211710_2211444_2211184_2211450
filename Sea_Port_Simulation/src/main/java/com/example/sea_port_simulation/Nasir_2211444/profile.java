package com.example.sea_port_simulation.Nasir_2211444;

public class profile {
    private String ClientName;
    private String Address;
    private String ContactNumber;
    private String Email;

    public profile(String clientName, String address, String contactNumber, String email) {
        ClientName = clientName;
        Address = address;
        ContactNumber = contactNumber;
        Email = email;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "profile{" +
                "ClientName='" + ClientName + '\'' +
                ", Address='" + Address + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
