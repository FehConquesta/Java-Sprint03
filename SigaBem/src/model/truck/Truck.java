package model.truck;

public class Truck {
    public Truck(int id, String name, TypeOfTruck type, float fuel, boolean electric) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.fuel = fuel;
        this.electric = electric;
    }

    private int id;
    private String name;
    private TypeOfTruck type;
    private float fuel;
    private boolean electric;

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

    public TypeOfTruck getType() {
        return type;
    }

    public void setType(TypeOfTruck type) {
        this.type = type;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }
}
