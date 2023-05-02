package com.example.creational.prototype;

import java.util.List;

public class prototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();
        System.out.println(employee.getEmployees());

        Employee employee1 = (Employee) employee.clone();
        List<String> list1 = employee1.getEmployees();
        list1.add("S");
        list1.add("Z");
        System.out.println(list1);

        Employee employee2 = (Employee) employee.clone();
        List<String> list2 = employee2.getEmployees();
        list2.remove("C");

        System.out.println(list2);
    }

}
