package org.example._2023_11_29;

import java.util.List;

public class Taski1129 {
    public int sumArr(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return result;
    }

    public int sumList(List<Integer> list) {
        int result = 0;
        for (Integer integer : list) {
            result += integer;
        }
        return result;
    }
}
