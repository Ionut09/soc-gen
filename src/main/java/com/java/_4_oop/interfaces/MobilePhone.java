package com.java._4_oop.interfaces;

public class MobilePhone implements Phone {

    private String model;

    private String version;

    private boolean ring;

    private boolean on;

    public MobilePhone(String model, String version) {
        this.model = model;
        this.version = version;
    }


    @Override
    public void answer() {
        see();
        if (on) {
            ring = false;
            System.out.println("Answering the mobile phone");
            return;
        }
        System.out.println("Phone is off, please turn it on.");
    }

    @Override
    public void call(String number) {
        System.out.println("Dialing " + number);
    }

    @Override
    public void powerOn() {
        on = true;
    }

    public boolean equals(Object other) {
        if (other instanceof MobilePhone) {
            MobilePhone compared = (MobilePhone) other;
            return compared.version.equals(this.version)
                    && compared.model.equals(this.model);
        }
        return false;
    }

    //mobilePhone.equals(other);
}
