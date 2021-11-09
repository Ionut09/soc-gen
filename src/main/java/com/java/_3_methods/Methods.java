package com.java._3_methods;

public class Methods {

    public static void main(String... args) {
        var arr = new int[]{1, 2, 3, 4, 5, 6};
        var sum = sum(arr);
        sum = sum(1, 2, 3, 4, 5, 6);
        System.out.println("sum = " + sum);
        sum();
    }

    private static int sum(int... arr) {
        var sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    private static double sum(double... arr) {
        var sum = 0.0;
        for (double element : arr) {
            sum += element;
        }
        return sum;
    }

//    static int sum(int[] arr) {
//        var sum = 0;
//        for (int element : arr) {
//            sum += element;
//        }
//        return sum;
//    }
}
