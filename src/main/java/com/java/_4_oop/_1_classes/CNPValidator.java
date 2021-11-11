package com.java._4_oop._1_classes;

import com.java._6_exceptions.MyUncheckkedException;

public class CNPValidator {

    public static void validateCNP(String cnp) throws MyUncheckkedException {
        var length = cnp.length() == 13;
        if (!length) {
            throw new MyUncheckkedException("Bad CNP. Should have length 13");
        }
        for (char c : cnp.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Bad CNP. Should have only digits");
            }
        }
        if (!(cnp.startsWith("5") || cnp.startsWith("6") || cnp.startsWith("1") || cnp.startsWith("2"))) {
            throw new IllegalArgumentException("Bad CNP. Should start with 1,2,5 or 6");
        }
    }
}
