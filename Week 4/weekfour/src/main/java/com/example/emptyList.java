package com.example;

//How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class emptyList {
    public static void main(String[] args) {

        Optional<List<Employee>> list = Optional.ofNullable(createEmployees());
        // Optional<List<Employee>> list = createEmployees();

        if (list.isEmpty())
            System.out.println("Empty list");
        else {
            list.stream().forEach(o -> o.forEach(n -> System.out.println(n.getName())));
        }

        Consumer c = i -> System.out.println(i);
        Runnable r = () -> System.out.println("Empty list");
        list.ifPresentOrElse(c, r);

        // Optional
        // .ofNullable(createEmployees())
        // .orElse(Collections.emptyList())
        // .stream().filter(Objects::nonNull)
        // .forEach(System.out::print);
    }

    public static List<Employee> createEmployees() {
        Employee e1 = new Employee(1, "a", 1000);
        Employee e2 = new Employee(2, "b", 1500);
        Employee e3 = new Employee(3, "c", 10000);
        Employee e4 = new Employee(4, "d", 700);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);

        return list;

    }

}
