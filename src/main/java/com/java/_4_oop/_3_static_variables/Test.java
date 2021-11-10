package com.java._4_oop._3_static_variables;

import com.java._4_oop._2_inheritance.Animal;
import com.java._4_oop._2_inheritance.Dog;

import static com.java._4_oop._3_static_variables.Counter.print;

public class Test {

    public static void main(String... args) {
        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        //com.java._4_oop._2_inheritance.Animal --> fully qualified name
        Animal animal = new Dog();

//        c2.counter++;
//        c2.counter++;
        c2.counter++;
        c2.counter++;
        Counter.counter++;
        print(); //name nu exista

        System.out.println(c.counter);
        System.out.println(c1.counter);
        System.out.println(c2.counter);

    }
}
