package model.towtruck;

import model.truck.Brand;

import java.util.Date;

public class TypeOfTowTruck {
    public TypeOfTowTruck(int id, boolean platform, float weightCapacity, Brand brand,
                          String model, Date year, String tools) {
        this.id = id;
        this.platform = platform;
        this.weightCapacity = weightCapacity;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.tools = tools;
    }

    private int id;
    private boolean platform;
    private float weightCapacity;
    private Brand brand;
    private String model;
    private Date year;
    private String tools;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPlatform() {
        return platform;
    }

    public void setPlatform(boolean platform) {
        this.platform = platform;
    }

    public float getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(float weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }
}
