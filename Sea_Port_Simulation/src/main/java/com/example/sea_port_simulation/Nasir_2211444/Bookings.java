package com.example.sea_port_simulation.Nasir_2211444;

import java.time.LocalDate;

public class Bookings {
    private String ClientName;
    private String ClientID;
    private String ClientCountry;
    private LocalDate Booking_Date;
    private String Booking_Type;
    private String ShippingCountry;
    private String Weight;

    public Bookings(String clientName, String clientID, String clientCountry, LocalDate booking_Date, String booking_Type, String shippingCountry, String weight) {
        ClientName = clientName;
        ClientID = clientID;
        ClientCountry = clientCountry;
        Booking_Date = booking_Date;
        Booking_Type = booking_Type;
        ShippingCountry = shippingCountry;
        Weight = weight;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getClientCountry() {
        return ClientCountry;
    }

    public void setClientCountry(String clientCountry) {
        ClientCountry = clientCountry;
    }

    public LocalDate getBooking_Date() {
        return Booking_Date;
    }

    public void setBooking_Date(LocalDate booking_Date) {
        Booking_Date = booking_Date;
    }

    public String getBooking_Type() {
        return Booking_Type;
    }

    public void setBooking_Type(String booking_Type) {
        Booking_Type = booking_Type;
    }

    public String getShippingCountry() {
        return ShippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        ShippingCountry = shippingCountry;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "ClientName='" + ClientName + '\'' +
                ", ClientID='" + ClientID + '\'' +
                ", ClientCountry='" + ClientCountry + '\'' +
                ", Booking_Date=" + Booking_Date +
                ", Booking_Type='" + Booking_Type + '\'' +
                ", ShippingCountry='" + ShippingCountry + '\'' +
                ", Weight='" + Weight + '\'' +
                '}';
    }
}
