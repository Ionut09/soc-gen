package com.java._2_basic_structures;

import java.time.Month;
import java.util.Scanner;

public class Switch {

    public static void main(String... args) {
        var numberOfDays = switchFallThrough();
        System.out.println(numberOfDays);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter operation: ");

        var operation = scanner.next(); //type-inference

        switch (operation) {

            case "+": {
                System.out.println("a+b = " + (a + b));
                break;
            }
            case "-": {
                System.out.println("a-b = " + (a - b));
                break;
            }
            case "*": {
                System.out.println("a*b = " + (a * b));
                break;
            }
            case "/": {
                System.out.println("a/b = " + ((double) a / b)); //doar partea intreaga a /
                break;
            }
            default: {
                System.out.println("Bad operation");
            }
        }
    }

    /**
     * print number of days for each month
     */
    public static int switchFallThrough() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        var monthStr = scanner.next();
        var month = Month.valueOf(monthStr.toUpperCase()); //conversie de la string la enum
        System.out.print("numberOfDays is: "); //print nu adauga linie noua

        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER: {
                return 31;
            }

            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER: {
                return 30;
            }
            case FEBRUARY:
                return 28;
            default:
                return 0;
        }
    }
}
