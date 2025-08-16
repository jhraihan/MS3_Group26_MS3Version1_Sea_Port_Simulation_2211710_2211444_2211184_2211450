package com.example.sea_port_simulation.jahid_2211710;

public class Dock {
    private String dockID;
    private String name;
    private String sizeCatagory;
    private String status;
    private String maxShipSize;
    private String speciallization;
    private String location;

    public Dock(String dockID, String name, String sizeCatagory, String status, String maxShipSize, String speciallization, String location) {
        this.dockID = dockID;
        this.name = name;
        this.sizeCatagory = sizeCatagory;
        this.status = status;
        this.maxShipSize = maxShipSize;
        this.speciallization = speciallization;
        this.location = location;
    }

    public String getDockID() {
        return dockID;
    }

    public void setDockID(String dockID) {
        this.dockID = dockID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSizeCatagory() {
        return sizeCatagory;
    }

    public void setSizeCatagory(String sizeCatagory) {
        this.sizeCatagory = sizeCatagory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMaxShipSize() {
        return maxShipSize;
    }

    public void setMaxShipSize(String maxShipSize) {
        this.maxShipSize = maxShipSize;
    }

    public String getSpeciallization() {
        return speciallization;
    }

    public void setSpeciallization(String speciallization) {
        this.speciallization = speciallization;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Dock{" +
                "dockID='" + dockID + '\'' +
                ", name='" + name + '\'' +
                ", sizeCatagory='" + sizeCatagory + '\'' +
                ", status='" + status + '\'' +
                ", maxShipSize='" + maxShipSize + '\'' +
                ", speciallization='" + speciallization + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
