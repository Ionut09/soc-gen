package com.java._4_oop._1_classes;

public class PoliManagement {

    public static void main(String... args) {
        Student student = new Student();
        student.setCnp("2932987397232"); //this este obiectul student
        student.setAge(21);
        student.setFirstName("Bob");
        student.setLastName("Dylan");

        Student john = new Student("John", "Doe", "5234567877772", 22);
        System.out.println(student);
        System.out.println(john);

        Student s = new Student();
        System.out.println(s);
    }
}
