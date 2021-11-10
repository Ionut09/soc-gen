package com.java._4_oop._1_classes;

public class Student {

    private String firstName;

    private String lastName;

    private String cnp; //null care e diferit de "" (empty string)

    private int age; //primitivele au default values in Java: 0, 0.0, false

    public Student() { //doar un constructor stie sa construiasca un obiect
//        firstName = "";
//        lastName = "";
//        cnp = "";         --> o oarecare duplicare
//        age = 0;
        this("","","", 0); //this() e permis doar intr-un alt constructor
    }

    public Student(String firstName, String lastName, String cnp, int age) {
        this.firstName = firstName; //this este o referinta la obiectul construit
        this.lastName = lastName;
//        this.cnp = cnp;
//        this.age = age;
        setCnp(cnp);
        setAge(age);
    }

    //encapsulation
    public void setCnp(String cnp) {
//      if(!cnp.matches("^(1|2|5|6)[0-9]{12}")){
        if (!cnp.matches("^(1|2|5|6)\\d{12}")) {
            throw new IllegalArgumentException("Bad CNP. Should have only digits, start with 1,2,5 or 6 and have length 13");
        }
        //this este o referinta la obiectul cu care invocam metoda (cu care lucram)
        this.cnp = cnp;
    }

    public void setAge(int age) {
        if (age > 5 && age < 100) {
            this.age = age;
            return;
        }
        throw new IllegalArgumentException("Age should be between 5 and 100");
    }

    public String toString() { //dam o reprezentare sub forma de String a unui obiect
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp='" + cnp + '\'' +
                ", age=" + age +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
