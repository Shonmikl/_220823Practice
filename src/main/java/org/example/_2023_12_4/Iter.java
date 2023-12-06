package org.example._2023_12_4;

import java.util.*;

public class Iter {
    public static void main(String[] args) {
        /**
         * M A D A M
         * SADDES
         * WOOD
         */
        List<String> list = new LinkedList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        list.add("ff");
        list.add("gg");

        ListIterator<String> forward = list.listIterator();
        ListIterator<String> backward = list.listIterator(list.size());

        while (forward.hasNext()) {
            String f = forward.next();
            System.out.println("FORWARD: " + f);
        }

        while (backward.hasPrevious()) {
            String b = backward.previous();
            System.out.println("BACKWARD: " + b);
        }
    }
}