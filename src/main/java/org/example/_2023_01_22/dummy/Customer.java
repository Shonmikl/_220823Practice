package org.example._2023_01_22.dummy;

public class Customer {
    private String fname;
    private String lname;
    private Address address;

    public Customer(String fname, String lname, Address address) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", address=" + address +
                '}';
    }
}
