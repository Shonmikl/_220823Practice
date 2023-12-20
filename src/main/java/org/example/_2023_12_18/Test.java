package org.example._2023_12_18;

public class Test {
    public static void main(String[] args) {
        m(Test::ref);
    }

    public static void ref() {
        System.out.println("***");
    }

    public static void m(Inter inter) {
        inter.get();
    }
}

@FunctionalInterface
interface Inter {
    void get();
}
