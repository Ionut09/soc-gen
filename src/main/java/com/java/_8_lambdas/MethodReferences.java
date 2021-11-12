package com.java._8_lambdas;

import com.java._7_collections.Employee;

import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.Comparator.comparing;

public class MethodReferences {

    public static void main(String... args) {

//        Comparator<Employee> employeeComparator = Comparator.comparing((Employee emp) -> emp.getAge());
        var employeeComparator = comparing(Employee::getAge);

        //f():Employee
//      Supplier<Employee> s = () -> new Employee();
        Supplier<Employee> s = Employee::new;

        Employee employee = new Employee("John", 30);

        Function<Employee, String> mapper = (emp) -> employee.getName();

        Function<Employee, String> mapperMethodReference = Employee::getName;

    }
}
