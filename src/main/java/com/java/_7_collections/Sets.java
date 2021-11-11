package com.java._7_collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor //metadate --> annotation processors
public class Sets {

    public static void main(String... args) {
        Set<Employee> employees = new HashSet<>();

        boolean add1 = employees.add(new Employee("John", 35));
        boolean add = employees.add(new Employee("John", 35));
        employees.add(new Employee("John", 35));
        employees.add(new Employee("John", 35)); //hashcode returneaza un cod unic

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Employee john = new Employee("John", 35);
        Employee john1 = new Employee("John", 35);

        System.out.println("john.equals(john1) -> " + john.equals(john1));
        System.out.println("john.hashCode() == john1.hashCode() -> " + (john.hashCode() == john1.hashCode()));

        employees.contains(john); //true
        employees.add(john); //false --> il avem pe John

        employees.remove(john);
        System.out.println("employees = " + employees);

//        Set<Employee> setForTests = Set.of(john, john1);

        var set = Set.of("skjans", "jsnka");

        //sorted sets

        TreeSet<Employee> sorted = new TreeSet<>();//Employee nu are acea ordine de sortare

        sorted.add(john);
        sorted.add(new Employee("Ana", 30));
        sorted.add(new Employee("AneMarie", 35));

        System.out.println(sorted);

//        Comparator
        // int compare(Employee o1, Employee o2);
        Comparator<Employee> employeeAgeComparator = (Employee o1, Employee o2) -> {
            return o1.getAge() - o2.getAge();
        };
        employeeAgeComparator = Comparator.comparing((Employee emp) -> emp.getAge());//comparam obiecte dupa o cheie de comparatie(un field al obiectului)
//        sorted = new TreeSet<>(employeeAgeComparator.thenComparing((Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName())));
        sorted = new TreeSet<>(employeeAgeComparator.thenComparing((Employee emp)-> emp.getName()));

        sorted.addAll(sorted);



    }


}
