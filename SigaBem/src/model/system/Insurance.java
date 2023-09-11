package model.system;

public class Insurance {
    public Insurance(byte id, float price, Category category) {
        this.id = id;
        this.price = price;
        this.category = category;
    }

    private byte id;
    private float price;
    private Category category;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
