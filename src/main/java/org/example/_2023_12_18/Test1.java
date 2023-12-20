package org.example._2023_12_18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Q", "W", "E", "R");
//        list.forEach(System.out::println);

        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        // 1 2 3 4 5 6 7 8 9
        System.out.println(list1);
        int g = list1.stream()
                .filter(digit -> digit % 2 == 0) //2 4 6 8
                .map(num -> (num + num) * num * 10) // 80 320 720 1280
                .reduce(Integer::sum)
                .orElseThrow();

        System.out.println(g); // 2400


    }
}
