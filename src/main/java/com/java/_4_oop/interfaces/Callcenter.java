package com.java._4_oop.interfaces;

public class Callcenter {

    public static void main(String... args) {
        MobilePhone iPhone = new MobilePhone("IPhone", "12");

        Device device = iPhone;
        Phone phone = iPhone;

        device.powerOn();
        ((MobilePhone) device).answer();

        Device deskPhone = new DeskPhone();
        if (deskPhone instanceof MobilePhone) { //false
            //cast explicit
            ((MobilePhone) deskPhone).answer(); //-->  java.lang.ClassCastException
        }

        System.out.println(deskPhone instanceof Phone); //true
        System.out.println(deskPhone instanceof DeskPhone); //true
        System.out.println(deskPhone instanceof Device); //true

        if (device instanceof Phone) {
            Phone phone1 = (Phone) device;
        }

        System.out.println("-------------------");

        device = new MobilePhone("IPhone", "12");

        System.out.println(iPhone.equals(deskPhone)); //false
        System.out.println(iPhone.equals(device)); //true
        System.out.println(iPhone == device); //false compara efectiv adresele de memorie

        System.out.println(null instanceof Device);//false

        device.see();
    }
}
