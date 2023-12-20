package org.example._2023_12_18;

import java.util.Optional;
import java.util.stream.Stream;

public class Fib {
    //0 1 1 2 3 5 8 13 21 34 55

    //O(n)
    public static long fibLOOP(final int idx) {
        if (idx < 0) {
            throw new IllegalArgumentException();
        }

        long fib1 = -1L;
        long fib2 = 1L;

        for (int i = 0; i <= idx; i++) {
            long result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }
        return fib2;
    }

    //O(2^n)
    public static long fibREC(final int idx) {
        return idx == 1 || idx == 2 ? 1L : fibREC(idx - 2) + fibREC(idx - 1);
    }

    public static Optional<Long> fibSTREAM(final int idx) {
        var result =
                Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[1], arr[0] + arr[1]})
                        .limit(idx + 1)
                        .map(y -> y[0])
                        .max(Long::compareTo);
        return result;
    }

    public static void main(String[] args) {
        int idx = 48;

        long startTimeLOOP = System.currentTimeMillis();
        fibLOOP(idx);
        System.out.println("LOOP: " + (System.currentTimeMillis() - startTimeLOOP));

        long startTimeREC = System.currentTimeMillis();
        fibREC(idx);
        System.out.println("REC: " + (System.currentTimeMillis() - startTimeREC));

        long startTimeSTREAM = System.currentTimeMillis();
        fibSTREAM(idx);
        System.out.println("STREAM: " + (System.currentTimeMillis() - startTimeSTREAM));
    }
}