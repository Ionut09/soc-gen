package com.java._4_oop._2_inheritance;

public abstract class Animal {

    private String species;

    private boolean brain;

    private int weight;

    public String getSpecies() { //Java bean naming convention get/set fieldName cu capital first letter, cu exceptie boolean properties get -> is
        return species;
    }

    public boolean isBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }

    public Animal() {
    }

    public Animal(String species, boolean brain, int weight) {
        this.species = species;
        this.brain = brain;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public Animal move() {
        System.out.println("Animal moves");
        return null;
    }

    public void sleep() {
        System.out.println("Animal sleep");
    }
}
