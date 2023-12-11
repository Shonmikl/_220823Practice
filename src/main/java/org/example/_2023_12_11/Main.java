package org.example._2023_12_11;

import com.github.javafaker.Faker;

public class Main {
    private static final Library[] LIBRARIES = Generator.libraryGen();
    public static void main(String[] args) {
//        Handler.printAllAddresses(LIBRARIES);
//        Handler.printTotalBookCount(LIBRARIES);

        for (int i = 0; i < 10; i++) {
            System.out.println(new Faker().beer().name());
        }
    }
}