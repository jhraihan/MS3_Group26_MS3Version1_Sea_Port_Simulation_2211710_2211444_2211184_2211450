package com.example.sea_port_simulation.jahid_2211710;

public class Ship {
    private String ship_id;
    private String name,shipType;
    private String Cargo_type;
    private String size;
    private String assigned_dock;

    public Ship(String ship_id, String name, String shipType, String cargo_type, String size, String assigned_dock) {
        this.ship_id = ship_id;
        this.name = name;
        this.shipType = shipType;
        Cargo_type = cargo_type;
        this.size = size;
        this.assigned_dock = assigned_dock;
    }

    public String getShip_id() {
        return ship_id;
    }

    public void setShip_id(String ship_id) {
        this.ship_id = ship_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getCargo_type() {
        return Cargo_type;
    }

    public void setCargo_type(String cargo_type) {
        Cargo_type = cargo_type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAssigned_dock() {
        return assigned_dock;
    }

    public void setAssigned_dock(String assigned_dock) {
        this.assigned_dock = assigned_dock;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "ship_id='" + ship_id + '\'' +
                ", name='" + name + '\'' +
                ", shipType='" + shipType + '\'' +
                ", Cargo_type='" + Cargo_type + '\'' +
                ", size='" + size + '\'' +
                ", assigned_dock='" + assigned_dock + '\'' +
                '}';
    }
}
