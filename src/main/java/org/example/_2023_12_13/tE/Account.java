package org.example._2023_12_13.tE;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private Country country;
    private Currency currency;
    private boolean isDebit;
    private BigDecimal balance;
}

class Bank {
    private Branch[] branches;
}

class Branch {
    private String branchName;
    private Empl[] employees;
}

class Empl {
    private String name;
    private String surName;
    private Account[] account;
    private Citezeship citizenship;
}

enum Country {

}

enum Currency {

}

enum Citezeship {

}
