package org.example._2024_01_08.ex;

import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Handler {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static Set<Kid> generateKids() {
        Set<Kid> set = new HashSet<>();
        for (int i = 0; i < 25; i++) {
            set.add(new Kid(FAKER.name().name(), RANDOM.nextInt(11)));
        }
        return set;
    }
}
