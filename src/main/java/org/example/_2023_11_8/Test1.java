package org.example._2023_11_8;

public class Test1 {
    String name(int digit, String string) {
        return null;
    }

    //sum all el of array
    public static int sum(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result = result + j; //result +=arr[i];
        }
        return result;
    }

    //1 2 3 4 5 6 7 8 --> 1 + 8, 2 + 7, 3 + 6 ,,,,,
    public static int sum1(int[] arr) {
        int result = 0; //1
        for (int i = 0; i < arr.length / 2; i++) {
            result = result + (arr[i] + arr[arr.length - 1 - i]);
        }
        return result;
    }

    //min el -> 8 9 1 3 44 10 -96
    public static int firstMin(int[] arr) {
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    //min2 el -> 8 9 1 3 44 10 -96
    public static int secondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < min) {
                min2 = min;
                min = j;
            } else if (j < min2 && j != min) {
                min2 = j;
            }
        }
        return 0;
    }


    static int a = 100;
    int b;

    public static void main(String[] args) {
        Test1.a = 55;

        Test1 o1 = new Test1();
        o1.b = 11;

        Test1 o2 = new Test1();
        o2.b = 22;

        System.out.println(o1.b);
    }
}