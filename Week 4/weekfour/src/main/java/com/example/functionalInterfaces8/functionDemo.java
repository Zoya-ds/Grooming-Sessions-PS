package com.example.functionalInterfaces8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.example.Employee;

public class functionDemo implements Function {

    @Override
    public Object apply(Object t) {
        if (t instanceof Employee) {
            Employee e = (Employee) t;
            return e.getName();
        }
        return "No one found";
    }

    public static void main(String[] args) {

        List<Employee> list = createEmployees();

        functionDemo functionDemo = new functionDemo();
        list.stream().map(functionDemo).forEach(System.out::println);

        Function<Employee, Integer> f = new Function<Employee, Integer>() {

            public Integer apply(Employee t) {
                return t.getSalary();
            };
        };

        list.stream().map(f).forEach(System.out::println);

    }

    public static List<Employee> createEmployees() {
        Employee e1 = new Employee(1, "a", 1000);
        Employee e2 = new Employee(2, "b", 400);
        Employee e3 = new Employee(3, "c", 10000);
        Employee e4 = new Employee(4, "d", 700);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);

        return list;
    }

}
