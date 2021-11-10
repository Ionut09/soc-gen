package com.java._4_oop._2_inheritance;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String... args) {
        Dog dog; //referinta --> Dog
        dog = new Dog("labrador", "Lassie", 30); //obiectul -> Dog
        System.out.println(dog);
        dog.eat();
        dog.move();
        dog.move("Ionut");
        dog.sleep();

        Animal sasha = new Dog("Amstaaf", "Sasha", 30);
        sasha = new Cat(3, "Maidaneza", "Sasha");
//        List list = new ArrayList();

        sasha.move();

//        Animal animal = new Animal(); nu are sens sa fie instantiata
    }
}
