package model.truck;

import model.system.Category;

import java.util.Date;

public class TypeOfTruck {
    public TypeOfTruck(int id, boolean tractor, float weight, Brand brand,
                       String model, Date year, float fuelCapacity, Category category) {
        this.id = id;
        this.tractor = tractor;
        this.weight = weight;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        this.category = category;
    }

    private int id;
    private boolean tractor;
    private float weight;
    private Brand brand;
    private String model;
    private Date year;
    private float fuelCapacity;
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTractor() {
        return tractor;
    }

    public void setTractor(boolean tractor) {
        this.tractor = tractor;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
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

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
