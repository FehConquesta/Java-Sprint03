package model.conditions;

public class Road {
    public Road(boolean bumpy, boolean wet, boolean incident, boolean hole, boolean dirtRoad) {
        this.bumpy = bumpy;
        this.wet = wet;
        this.incident = incident;
        this.hole = hole;
        this.dirtRoad = dirtRoad;
    }

    private boolean bumpy;
    private boolean wet;
    private boolean incident;
    private boolean hole;
    private boolean dirtRoad;

    public boolean isBumpy() {
        return bumpy;
    }

    public void setBumpy(boolean bumpy) {
        this.bumpy = bumpy;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }

    public boolean isIncident() {
        return incident;
    }

    public void setIncident(boolean incident) {
        this.incident = incident;
    }

    public boolean isHole() {
        return hole;
    }

    public void setHole(boolean hole) {
        this.hole = hole;
    }

    public boolean isDirtRoad() {
        return dirtRoad;
    }

    public void setDirtRoad(boolean dirtRoad) {
        this.dirtRoad = dirtRoad;
    }

    public String getRoadCondition(){
//        System.out.println("*=* Road Condition *=*");
        String roadCondition = "Bumpy: " +(bumpy? "Yes": "No") + "\n";
        roadCondition += "Wet: " +(wet ? "Yes": "No") + "\n";
        roadCondition += "Incident: " +(incident ? "Yes": "No") + "\n";
        roadCondition += "Hole: " +(hole ? "Yes": "No") + "\n";
        roadCondition += "Dirty: " +(dirtRoad ? "Yes": "No") + "\n";
        return roadCondition;

    }
}
