package com.example.sea_port_simulation.jahid_2211710;

public class CargoStatus {
    private int shipID;
    private String currentDockLocation,shipName,cargoOperationType,cargoCatagory,statusSelection;

    public CargoStatus(int shipID, String currentDockLocation, String shipName, String cargoOperationType, String cargoCatagory, String statusSelection) {
        this.shipID = shipID;
        this.currentDockLocation = currentDockLocation;
        this.shipName = shipName;
        this.cargoOperationType = cargoOperationType;
        this.cargoCatagory = cargoCatagory;
        this.statusSelection = statusSelection;
    }

    public int getShipID() {
        return shipID;
    }

    public void setShipID(int shipID) {
        this.shipID = shipID;
    }

    public String getCurrentDockLocation() {
        return currentDockLocation;
    }

    public void setCurrentDockLocation(String currentDockLocation) {
        this.currentDockLocation = currentDockLocation;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getCargoOperationType() {
        return cargoOperationType;
    }

    public void setCargoOperationType(String cargoOperationType) {
        this.cargoOperationType = cargoOperationType;
    }

    public String getCargoCatagory() {
        return cargoCatagory;
    }

    public void setCargoCatagory(String cargoCatagory) {
        this.cargoCatagory = cargoCatagory;
    }

    public String getStatusSelection() {
        return statusSelection;
    }

    public void setStatusSelection(String statusSelection) {
        this.statusSelection = statusSelection;
    }

    @Override
    public String toString() {
        return "CargoStatus{" +
                "shipID=" + shipID +
                ", currentDockLocation='" + currentDockLocation + '\'' +
                ", shipName='" + shipName + '\'' +
                ", cargoOperationType='" + cargoOperationType + '\'' +
                ", cargoCatagory='" + cargoCatagory + '\'' +
                ", statusSelection='" + statusSelection + '\'' +
                '}';
    }
}
