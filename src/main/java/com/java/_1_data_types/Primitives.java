package com.java._1_data_types;

import java.math.BigDecimal;

public class Primitives {

    /**
     * Some main docs
     *
     * @return void
     * @deprecated
     */
    public static void main(String... args) {
//        System.out.println("Welcome to Java: " + args[0]);

        /*
        Multiline comment
         */

        //integers
        byte b = 2;
        short s = 2;
        char c = 'a'; //in spate code (Unicode), Java foloseste UTF-16 --> 2 bytes

        System.out.println("c = " + c); //a
        System.out.println("c+1 = " + (c + 1)); //98

        c = 97;
        System.out.println("c = " + c);

        int i = 2; //by default un literal intreg e int in Java
        long l = 2732628736827638672L; //sau l

        //reale
        double d = 2.5; //by default un literal real e double in Java
        d = 3.5D; //sau d

        float f = 2.5F; //sau f
        //NICIODATA nu folosim double/float pt amounts of money


        d = 5 / 3; //1
        d = 5 / 3.0_0; //1.(6)
        System.out.println("d = " + d);

//      BigDecimal --> folosim pentru sume de bani

        boolean b1 = true; //false

        //cast

        l = s; //cast implicit
        s = (short) i;

        l = 2_732_628_736_827_638___________________________672L;
        i = (int) l;
        System.out.println("i after overflow = " + i);
        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt + 1);

        //parsing -> conversie String to primitives
        String number = "123456";
        int i1 = Integer.parseInt(number); //i1 variabila de tip primitiva int
        Integer i2 = i1; //i2 va fi o referinta care pointeaza catre un obiect
        //conversia primitiva -> wrapper type se numeste boxing

        i1 = i2;
        //conversia wrapper type -> primitiva se numeste unboxing

        //in general o numim autoboxing

        double parsed = Double.parseDouble("2.456");
        System.out.println("parsed = " + (parsed + 0.004));
    }
}
