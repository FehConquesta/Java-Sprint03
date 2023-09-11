package model.system;

public class Problem {
    public Problem(long id, long occurrences, String description,
                   String name, String weather, String location, String road) {
        this.id = id;
        this.occurrences = occurrences;
        this.description = description;
        this.name = name;
        this.weather = weather;
        this.location = location;
        this.road = road;
    }

    private long id;
    private long occurrences;
    private Solution solution;
    private String description;
    private String name;
    private String weather;
    private String location;
    private String road;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOccurrences() {
        return occurrences;
    }

    public void updateOccurrences() {
        this.occurrences += 1;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTrack() {
        return road;
    }

    public void setTrack(String road) {
        this.road = road;
    }


    public String getProblemInfo(){
        System.out.println("*---* Problem details *---*");
        String problemInfo = "ID: " + id +"\n";
        problemInfo += "Occurrence: " + occurrences +"\n";
        problemInfo +="Description: " +description +"\n";
        problemInfo += "Name: " + name ;
        problemInfo +="\nWeather:\n" +weather ;
        problemInfo += "\nLocation:\n" +location ;
        problemInfo += "\nRoad:\n" +road ;

        return problemInfo;
    }
}
