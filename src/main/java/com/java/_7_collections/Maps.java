package com.java._7_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {


    public static void main(String... args) {
        Map<String, Employee> map = new HashMap<>();
        Map<String, Employee> unmodifiableMap = Map.of("John", new Employee("John", 35),
                "Anna", new Employee("Anna", 33));

        //Write
        map.put("John", new Employee("John", 35));
        map.put("Anna", new Employee("Anna", 33));
        map.put("Maria", new Employee("Maria", 36));

        System.out.println(map);
        //read
        Employee anna = map.get("Anna"); //null daca nu gaseste cheia
        anna = map.getOrDefault("Anna", new Employee());
        System.out.println("anna = " + anna);
        boolean hasJohn = map.containsKey("John");//true

        //delete
        Employee anna1 = map.remove("Anna"); //return obiectul sters

        Set<String> names = map.keySet();
        System.out.println("names = " + names);

        System.out.println(" Map entries on iteration");

        for (Entry<String, Employee> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

//        List --> index ordonata
//        index -> element

        Map<Integer, String> listEquivalentMap = new LinkedHashMap<>(); //
        int i = 0;
        listEquivalentMap.put(i++, "Bob");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, "Ana");
        listEquivalentMap.put(i++, null);

        listEquivalentMap.put(9, "Maria"); //daca cheia exista deja, valoarea mapata va fi suprascrisa
        listEquivalentMap.putIfAbsent(9, "Maria"); //daca cheia exista deja nu face nimic

        for (var entry : listEquivalentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
