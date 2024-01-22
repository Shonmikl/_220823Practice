package org.example._2023_01_22.dummy;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException();
        }

        customerList.add(customer);
    }

    public int size() {
        return customerList.size();
    }
}
