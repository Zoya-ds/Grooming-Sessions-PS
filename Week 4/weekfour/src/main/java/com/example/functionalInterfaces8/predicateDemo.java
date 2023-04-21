package com.example.functionalInterfaces8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.example.Employee;

public class predicateDemo implements Predicate {

    @Override
    public boolean test(Object t) {
        if (t instanceof Employee) {

            Employee e = (Employee) t;
            if (e.getSalary() > 500) {
                System.out.print(e.getId() + " " + e.getName() + " " + e.getSalary());
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        List<Employee> list = createEmployees();
        predicateDemo predicateDemo = new predicateDemo();

        list.stream().filter(predicateDemo).forEach((a) -> System.out.println());

        Predicate<Employee> p = new Predicate<Employee>() {
            public boolean test(Employee e) {
                if (e.getSalary() > 500) {
                    System.out.println(e.getName());
                    return true;
                }
                return false;
            };
        };

        list.stream().anyMatch(p);

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
