package com.java._4_oop._2_inheritance;

public class Cat extends Animal {

    private String breed;

    private String name;

    public Cat(int weight, String breed, String name) {
        super("Cat", true, weight);
        this.breed = breed;
        this.name = name;
    }

    @Override
    public Cat move() { //Cat is covariant of Animal
//        super.move();
        System.out.println("Cat moves");
        return new Cat(0, "", "");
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
