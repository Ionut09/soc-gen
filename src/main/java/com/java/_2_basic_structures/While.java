package com.java._2_basic_structures;

public class While {

    public static void main(String... args) {

        cmmdc(64, 80);
        cmmdc(65, 80);
        cmmdc(29, 80);
        cmmdc(113, 47);

    }

    /**
     * Algoritmul lui Euclid
     */
    private static void cmmdc(int a, int b) {
        System.out.print("CMMDC of " + a + " and " + b + " is: ");
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
        System.out.println("b = " + b);
    }
}
