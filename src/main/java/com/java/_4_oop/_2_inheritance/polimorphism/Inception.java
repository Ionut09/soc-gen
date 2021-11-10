package com.java._4_oop._2_inheritance.polimorphism;

public class Inception extends Movie{

    public Inception() {
        super();
    }

    @Override
    public void plot() {
        System.out.println("People get into other people dreams");
    }
}
