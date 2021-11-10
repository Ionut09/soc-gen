package com.java._4_oop._2_inheritance.polimorphism;

public abstract class Movie { //poate contine metode abstracte si nu poate fi instantiata

    public Movie() {
        super(); //-->Object
    }

    public abstract void plot();
}
