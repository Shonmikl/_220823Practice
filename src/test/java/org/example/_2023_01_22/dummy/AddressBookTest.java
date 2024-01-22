package org.example._2023_01_22.dummy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AddressBookTest {

    public Customer createCustomer() {
        State state = new State("NY");
        City city = new City("NY", state);
        Address address = new Address("M. Drive 55 ave", city);
        return new Customer("John", "Smith", address);
    }

    /**
     * v1
     */
    @Test
    void addCustomerPositiveTest() {
        Customer customer = createCustomer();
        AddressBook addressBook = new AddressBook();
        addressBook.addCustomer(customer);
        int expectedSize = 1;
        Assertions.assertEquals(expectedSize, addressBook.size());
    }

    /**
     * v2
     */
    @Test
    void addCustomerTestWithException() {
        Customer customer = null;
        AddressBook addressBook = new AddressBook();
        Assertions.assertThrows(IllegalArgumentException.class, () -> addressBook.addCustomer(customer));
    }

    /**
     * v3
     */

    @Test
    void addCustomerDUMMY() {
        Customer dummy = Mockito.mock(Customer.class);
        AddressBook addressBook = new AddressBook();
        addressBook.addCustomer(dummy);
        int expectedSize = 1;
        Assertions.assertEquals(expectedSize, addressBook.size());
    }
}