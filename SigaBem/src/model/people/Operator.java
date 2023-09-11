package model.people;

import java.util.Date;

public class Operator {
    public Operator(int id, boolean status, String name, Date birthdate, char genre) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.birthdate = birthdate;
        this.genre = genre;
    }

    private int id;
    private boolean status;
    private String name;
    private Date birthdate;
    private char genre;

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
}
