package org.example._2023_12_20;

import java.util.Arrays;
import java.util.List;

public class Mik {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("MAMA", "Myla", "ramu");
        list.stream()
                .map(el -> {
                    if(el.startsWith("M")) {
                        System.out.println("*************");
                //sout не будет вызван тк нет терминального оператора
                    }
                    return el.toLowerCase();
                });

    }
}
