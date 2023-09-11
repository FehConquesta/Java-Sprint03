package model.conditions;

public class Location {
    public Location(String zipCode, String highway, int km, String reference) {
        this.zipCode = zipCode;
        this.highway = highway;
        this.km = km;
        this.reference = reference;
    }

    private String zipCode;
    private String highway;
    private int km;
    private String reference;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getHighway() {
        return highway;
    }

    public void setHighway(String highway) {
        this.highway = highway;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLocationInfos(){
//        System.out.println("*=* Location *=*");
        String locationInfos = "ZipCode: " +zipCode +"\n";
        locationInfos += "Highway: " +highway +"\n";
        locationInfos += "KM: "+km +"\n";
        locationInfos += "Reference: " +reference;

        return locationInfos;
    }


}
