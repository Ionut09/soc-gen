package com.java._1_data_types;

import java.util.List;

public class Operators {


    public static void main(String... args) {
        Class<Operators> myClassInfo = Operators.class; // toate informatiile asociate clasei pt care a fost creat

//        System.out.println(myClassInfo.getName()); //fully qualified name
//        System.out.println(myClassInfo.getSimpleName());

        //arithmetic
        double complexOp = 2 - 3.5 + ((234 + 32873) * (20 - 23) + 50 / 10);

        int i = 5;
//        i++;  nicio diferenta
//        ++i;

//        System.out.println("i++ > 5 -> " + (i++ > 5)); // false
//        System.out.println("i = " + i);
//        System.out.println("i++ > 5 -> " + (++i > 5)); // true
//        System.out.println("i = " + i);

        //logici &&, || si !
        int a = 3;
        System.out.println("a < 4 || (i++ > 5) = " + (a < 4 || i++ > 5));
        //i++ > 5 nu mai este evaluat pt ca valoarea de adevar este dedusa din primul membru
        //caracteristica aceasta se numeste short-circuiting
        System.out.println("i = " + i);

        Object o = null;
        if (o != null && o.getClass().getSimpleName().equals("Operators")) {
            System.out.println("Got my class");
        }

        boolean b = true; //1

        i = i + 2; // <==>
        i += 2; //shortand operators

        boolean isEven;

        if (i % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }

        //if ce poate fi inlocuit cu un operator ternar
        isEven = (i % 2 == 0) ? true : false;


    }
}
