package com.example.functionalInterfaces8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import com.example.Employee;

public class binaryDemo implements BinaryOperator {

    @Override
    public Object apply(Object t, Object u) {
        Employee e = (Employee) t;
        return e;
    }

    public static void main(String[] args) {

        List<Employee> list = createEmployees();
        binaryDemo binaryDemo = new binaryDemo();

        for (Employee employee : list) {
            binaryDemo.apply(employee, employee.getName()); // 2 same parameters same return type
        }
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
