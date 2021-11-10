package com.java._4_oop.interfaces;

public interface Phone extends Device {

    String LABEL = "PHONE"; //public static final in mod implicit

    void answer();

    void call(String number);

    default void printLabel() { //metode de instanta, public implicit
        System.out.println(LABEL);
    }

    static void printLabelStatic() { //metode statica in interfata, public implicit
        System.out.println(LABEL);
    }

    private void printLabelPrivate() { //metode de instanta
        System.out.println(LABEL);
    }

}
