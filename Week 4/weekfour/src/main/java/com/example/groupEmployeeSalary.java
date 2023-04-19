package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class groupEmployeeSalary {

    public static void main(String[] args) {
        List<Employee> list = createEmployees();

        Set<Entry<Integer, List<Employee>>> employees = list.stream().collect(Collectors.groupingBy(e -> e.getSalary()))
                .entrySet();

        employees.stream().forEach(o -> {
            System.out.print(o.getKey() + ": ");
            o.getValue().forEach(i -> System.out.print(i.getName() + " "));
            System.out.println();
        });
    }

    public static List<Employee> createEmployees() {
        Employee e1 = new Employee(1, "a", 10000);
        Employee e2 = new Employee(2, "b", 15000);
        Employee e3 = new Employee(3, "c", 10000);
        Employee e4 = new Employee(4, "d", 700);
        Employee e5 = new Employee(5, "e", 4000);
        Employee e6 = new Employee(6, "f", 10000);
        Employee e7 = new Employee(7, "g", 15000);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);

        return list;

    }

}
