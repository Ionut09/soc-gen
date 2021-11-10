package com.java._4_oop.interfaces;

public interface Device {

    void powerOn();

    default void see() {
        seeHelper();
    }

    private void seeHelper() {
        System.out.println("See this default method works ");
    }
}
