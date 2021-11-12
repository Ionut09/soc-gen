package com.java._7_collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Lists {


    public static void main(String... args) {
        //generics
        List listWithNoGeneric = new ArrayList(); //pana in Java 5
        listWithNoGeneric.add("John");
        listWithNoGeneric.add(10);
        listWithNoGeneric.add(new BigDecimal(1000));

        Object john = listWithNoGeneric.get(0);
        if (john instanceof String) {
            String johnStr = (String) john;
            System.out.println(johnStr.toUpperCase());
        }
        Object ten = listWithNoGeneric.get(1);

        //creating lists
        List<String> names = new LinkedList<>(); //generica --> capacitate 10
        names.add("John");

//      list.add(10);
        String johnDinGenericList = names.get(0);

        List<Integer> ints = List.of(1, 2, 3); //e unmodifiable

        //adding elements
        names.add("Bob");
        names.add("Ana");
        names.add("Ana");
        names.add("Ana");
        names.add("Ana");
        names.add("Ana");
        names.add("Ana");
        names.add("Ana");
        names.add("Ana");
        names.add("Ana");

        names.add(1, "James"); //O(n)
        System.out.println(names.size()); //diferit de capacity (dimensiunea arrayului intern)

        names.set(10, "Anna"); //update
        System.out.println(names); //toate colectiile override toString

        //reading elements
        names.get(1);//Bob
        names.contains("Anna"); //true

        //removing
        names.remove("Ana");
        names.remove(10);

//
//        Predicate<String> predicate = new Predicate<String>() {
//
//            @Override
//            public boolean test(String name) { //singura metoda abstracta
//                return name.length() >= 4;
//            }
//        };

        Predicate<String> predicate = (String name) -> name.length() >= 4; //obiect

        names.removeIf(predicate); //labmda expression

        System.out.println(names);

        LinkedList<String> linked = (LinkedList<String>) names;

        linked.addFirst("Tom");
        linked.addLast("Andrei");
        linked.removeFirst();
        linked.removeLast();

        Collections.sort(names); //mutable, pot fi modificate
        names.sort(null);// sorting order
        System.out.println(names);

        String tom = "tom";
        String tomUppercase = tom.toUpperCase(); //immutable, ca si BigDecimal
        System.out.println("tom = " + tom);
        System.out.println("tomUppercase = " + tomUppercase);
        tom = tom.toLowerCase();
    }
}


class NamesPredicate implements Predicate<String> {

    @Override
    public boolean test(String name) {
        return name.length() >= 4;
    }
}
