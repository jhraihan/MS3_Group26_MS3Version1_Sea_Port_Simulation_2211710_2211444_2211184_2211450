package com.example.sea_port_simulation.Nasir_2211444;

public class AcknowledgeShip {
    private String ShipCaptainID;
    private String TypeMessage;
    private String ShipNumber;

    public AcknowledgeShip(String shipCaptainID, String typeMessage, String shipNumber) {
        ShipCaptainID = shipCaptainID;
        TypeMessage = typeMessage;
        ShipNumber = shipNumber;
    }

    public String getShipCaptainID() {
        return ShipCaptainID;
    }

    public void setShipCaptainID(String shipCaptainID) {
        ShipCaptainID = shipCaptainID;
    }

    public String getTypeMessage() {
        return TypeMessage;
    }

    public void setTypeMessage(String typeMessage) {
        TypeMessage = typeMessage;
    }

    public String getShipNumber() {
        return ShipNumber;
    }

    public void setShipNumber(String shipNumber) {
        ShipNumber = shipNumber;
    }

    @Override
    public String toString() {
        return "AcknowledgeShip{" +
                "ShipCaptainID='" + ShipCaptainID + '\'' +
                ", TypeMessage='" + TypeMessage + '\'' +
                ", ShipNumber='" + ShipNumber + '\'' +
                '}';
    }
}
