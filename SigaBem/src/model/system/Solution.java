package model.system;

import model.towtruck.TypeOfTowTruck;

public class Solution {
    public Solution(long id, String description, TypeOfTowTruck type, Problem problem) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.problem = problem;
    }

    private long id;
    private String description;
    private TypeOfTowTruck type;
    private Problem problem;

    public void findSolution() {
        //TODO use AI
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeOfTowTruck getType() {
        return type;
    }

    public void setType(TypeOfTowTruck type) {
        this.type = type;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }
}
