package com.java._4_oop.interfaces;

public class DeskPhone implements Phone {

    private boolean ring;

    private boolean on;

    @Override
    public void answer() {
        ring = false;
        System.out.println("Answering the desk phone");
    }

    @Override
    public void call(String number) {
        System.out.println("Dialing " + number);
    }

    @Override
    public void powerOn() {
        on = true;
    }
}
