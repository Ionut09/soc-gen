package com.java._7_collections;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee implements Comparable<Employee>{

    @EqualsAndHashCode.Include
    private String name;

    private int age;

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }
}
