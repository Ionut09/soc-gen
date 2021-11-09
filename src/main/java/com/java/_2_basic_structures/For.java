package com.java._2_basic_structures;

import java.util.Arrays;

public class For {

    public static void main(String... args) {
        int[] ints = new int[5]; //index de la 0 la 4
        ints[0] = 10;
        ints[1] = 11;
        ints[2] = 12;
        ints[3] = 13;
        ints[4] = 14;

        ints = new int[]{10, 11, 12, 13, 14};

        int[] arrayExplicit = {10, 11, 12, 13, 14};

       for (int tempVariable : arrayExplicit){
           System.out.println("tempVariable = " + tempVariable);
           tempVariable++;
       }
// <===>
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
            ints[i]++;
        }

        System.out.println(Arrays.toString(arrayExplicit));
        System.out.println(Arrays.toString(ints));

    }
}
