package model.truck;

public class Brand {
    public Brand(int id, String name, boolean national) {
        this.id = id;
        this.name = name;
        this.national = national;
    }

    private int id;
    private String name;
    private boolean national;

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

    public boolean isNational() {
        return national;
    }

    public void setNational(boolean national) {
        this.national = national;
    }

    public String getBrandInfo(){
        String brandInfo = "Id: " +id+ "\n";
        brandInfo += "Name: " + name +"\n";
        brandInfo += "National: " +(national ? "Yes": "No") + "\n";

        return brandInfo;
    }
}
