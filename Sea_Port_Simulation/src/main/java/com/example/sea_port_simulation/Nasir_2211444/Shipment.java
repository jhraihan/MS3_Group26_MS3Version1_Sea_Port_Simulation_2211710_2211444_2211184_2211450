package com.example.sea_port_simulation.Nasir_2211444;

public class Shipment {
    private String ClientID;
    private String ShippingID;

    public Shipment(String clientID, String shippingID) {
        ClientID = clientID;
        ShippingID = shippingID;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getShippingID() {
        return ShippingID;
    }

    public void setShippingID(String shippingID) {
        ShippingID = shippingID;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "ClientID='" + ClientID + '\'' +
                ", ShippingID='" + ShippingID + '\'' +
                '}';
    }
}
