package com.example.sea_port_simulation.Nasir_2211444;

public class Invoice {
    private String ClientID;
    private String ClientName;
    private String OrderNumber;
    private String ShipmentID;

    public Invoice(String clientID, String clientName, String orderNumber, String shipmentID) {
        ClientID = clientID;
        ClientName = clientName;
        OrderNumber = orderNumber;
        ShipmentID = shipmentID;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getShipmentID() {
        return ShipmentID;
    }

    public void setShipmentID(String shipmentID) {
        ShipmentID = shipmentID;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ClientID='" + ClientID + '\'' +
                ", ClientName='" + ClientName + '\'' +
                ", OrderNumber='" + OrderNumber + '\'' +
                ", ShipmentID='" + ShipmentID + '\'' +
                '}';
    }
}
