package model.towtruck;

import model.people.Driver;

public class TowTruck {
    public TowTruck(int id, String name, TypeOfTowTruck type, float gas, Driver driver, String licensePlate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.gas = gas;
        this.driver = driver;
        this.licensePlate = licensePlate;
    }

    private int id;
    private String name;
    private TypeOfTowTruck type;
    private float gas;
    private Driver driver;
    private String licensePlate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfTowTruck getType() {
        return type;
    }

    public void setType(TypeOfTowTruck type) {
        this.type = type;
    }

    public float getGas() {
        return gas;
    }

    public void setGas(float gas) {
        this.gas = gas;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
