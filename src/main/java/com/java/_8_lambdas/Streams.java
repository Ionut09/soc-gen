package com.java._8_lambdas;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Streams {

    public static void main(String... args) {
        List<String> names = List.of("Toby", "Lenny", "Anna", "Alex", "Jamie");

//      f(String):boolean
//      boolean test(String name)
        names.stream()
             .filter(name -> name.length() == 4)
             .sorted() //Comparable --> au ordine naturala
             .limit(2)
             //      void consume(String name)
             .forEach(out::println);  //str::startsWith

        names.stream()
             .collect(Collectors.toSet()); //




    }
}
