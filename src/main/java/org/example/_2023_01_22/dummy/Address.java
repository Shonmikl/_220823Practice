package org.example._2023_01_22.dummy;

public class Address {
    private String name;
    private City city;

    public Address(String name, City city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
