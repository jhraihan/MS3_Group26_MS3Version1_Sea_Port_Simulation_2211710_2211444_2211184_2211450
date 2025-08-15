package com.example.sea_port_simulation.Nasir_2211444;

public class Tracking {
    private String TrackingID;
    private String ShipmentID;
    private String Status;

    public Tracking(String trackingID, String shipmentID, String status) {
        TrackingID = trackingID;
        ShipmentID = shipmentID;
        Status = status;
    }

    public String getTrackingID() {
        return TrackingID;
    }

    public void setTrackingID(String trackingID) {
        TrackingID = trackingID;
    }

    public String getShipmentID() {
        return ShipmentID;
    }

    public void setShipmentID(String shipmentID) {
        ShipmentID = shipmentID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Tracking{" +
                "TrackingID='" + TrackingID + '\'' +
                ", ShipmentID='" + ShipmentID + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
