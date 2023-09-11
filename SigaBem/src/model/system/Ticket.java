package model.system;

import model.people.Client;
import model.people.Operator;
import model.towtruck.TowTruck;

public class Ticket {
    public Ticket(long id, TowTruck towTruck, Client client, Problem problem, Operator operator) {
        this.id = id;
        this.towTruck = towTruck;
        this.client = client;
        this.problem = problem;
        this.operator = operator;
    }

    private long id;
    private TowTruck towTruck;
    private Client client;
    private Problem problem;
    private Operator operator;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TowTruck getTowTruck() {
        return towTruck;
    }

    public void setTowTruck(TowTruck towTruck) {
        this.towTruck = towTruck;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
