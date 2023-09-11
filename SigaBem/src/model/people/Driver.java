package model.people;

import java.util.Date;

public class Driver {
    public Driver(int id, boolean status, String name, Date birthdate, char genre,
                  String license, char licenseType) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.birthdate = birthdate;
        this.genre = genre;
        this.license = license;
        this.licenseType = licenseType;
    }

    private int id;
    private boolean status;
    private String name;
    private Date birthdate;
    private char genre;
    private String license;
    private char licenseType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public char getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(char licenseType) {
        this.licenseType = licenseType;
    }
}
