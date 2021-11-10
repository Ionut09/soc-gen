package com.java._4_oop._2_inheritance;

public class Dog extends Animal { //extinde by default Object daca nu extinde alta clasa

    private String breed;

    private String name;

    public Dog(String breed, String name, int weight) {
        super("Dog", true, weight);
        this.breed = breed;
        this.name = name;
    }

    public Dog() {
        super("Dog", true, 0);
//        super(); //constructorul superclasei
    }

    //    @Override restrictioneaza metoda la a face overriding
    public void move(String owner) {
        System.out.println("Dog is taken to walk by: " + owner);
    }

    @Override
    public Animal move() {
        super.move();
        System.out.println("Dog is taken to walk");
        return null;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "species='" + getSpecies() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", brain='" + isBrain() + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
