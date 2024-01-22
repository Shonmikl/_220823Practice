package org.example._2023_01_22.dummy;

public class City {
    private String name;
    private State state;

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public City(String name, State state) {
        this.name = name;
        this.state = state;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}