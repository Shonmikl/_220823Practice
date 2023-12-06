package org.example._2023_11_29;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Taski1129 {
    public int sumArr(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return result;
    }


    public int[] sumList1(List<Integer> list) {
        List<Integer> list1 = list.stream().distinct().toList();
        int size = list1.size();
        int[] list2 = new int[size];
        for (Integer i : list1) {
            for (Integer i1 : list) {
                if (Objects.equals(list.get(i), list1.get(i1))) {
                    list2[i] = list2[i] + list1.get(i);
                }
            }
        }
        return list2;
    }

    public int sumList(List<Integer> list) {
        int result = 0;
        for (Integer integer : list) {
            result += integer;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 8, 7, 4, 5, 6, 3, 2, 1, 4, 5, 6, 9, 8, 7, 4, 1, 2, 2, 1, 2, 5, 0};

        int[] res = Arrays.stream(arr).distinct().filter(el -> el % 2 == 0).toArray();
    }
}
