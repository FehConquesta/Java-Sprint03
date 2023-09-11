package model.people;

import java.util.Date;

public class Client {
    public Client(int id, String name, Date birthdate, char genre,
                  String driverLicense, char driverLicenseType) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.genre = genre;
        this.driverLicense = driverLicense;
        this.driverLicenseType = driverLicenseType;
    }

    private int id;
    private String name;
    private Date birthdate;
    private char genre;
    private String driverLicense;
    private char driverLicenseType;

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

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public char getDriverLicenseType() {
        return driverLicenseType;
    }

    public void setDriverLicenseType(char driverLicenseType) {
        this.driverLicenseType = driverLicenseType;
    }
}
