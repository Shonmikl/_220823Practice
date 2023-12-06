package org.example._2023_12_06;

import java.util.*;

public class TestT {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Q");
        map.put(2, "Q");
        map.put(3, "W");
        map.put(4, "E");
        map.put(15, "D");
        map.put(15, "X");

        System.out.println(map);
    }
}
