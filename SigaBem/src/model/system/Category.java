package model.system;

public class Category {
    public Category(short id, float minWeight, float maxWeight, boolean status) {
        this.id = id;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.status = status;
    }

    private short id;
    private float minWeight;
    private float maxWeight;
    private boolean status;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public float getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(float minWeight) {
        this.minWeight = minWeight;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
