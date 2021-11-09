package com.java._2_basic_structures;

import java.util.Scanner;

public class IfElse {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter operation: ");

        var operation = scanner.next(); //type-inference

        if (operation.equals("+")) {
            System.out.println("a+b = " + (a + b));
        } else if (operation.equals("-")) {
            System.out.println("a-b = " + (a - b));
        } else if (operation.equals("*")) {
            System.out.println("a*b = " + (a * b));
        } else if (operation.equals("/") && b != 0) {
            System.out.println("a/b = " + ((double) a / b)); //doar partea intreaga a /
        } else {
            System.out.println("Bad operation");
        }
    }
}
