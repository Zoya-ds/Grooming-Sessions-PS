package com.example;

import java.util.Arrays;
import java.util.List;

public class sortEmployeeSalary {

    public static void main(String[] args) {
        List<Employee> list = createEmployees();

        list.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary()).forEach(i -> System.out.println(i.getId()));
    }

    public static List<Employee> createEmployees() {
        Employee e1 = new Employee(1, "a", 1000);
        Employee e2 = new Employee(2, "b", 1500);
        Employee e3 = new Employee(3, "c", 10000);
        Employee e4 = new Employee(4, "d", 700);
        Employee e5 = new Employee(5, "e", 4000);
        Employee e6 = new Employee(6, "f", 7500);
        Employee e7 = new Employee(7, "g", 15000);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);

        return list;

    }
}
