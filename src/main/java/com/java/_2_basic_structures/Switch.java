package com.java._2_basic_structures;

public class Switch {

    public static void main(String... args) {
        String s = "jsnakjs";

        switch (s) {

            case "something" : {
                //do something
                break;
            }

            case "somethingElse" : {
                //do something eslse
                break;
            }

            default: {
                // do something in case of no match
            }
        }
    }
}
