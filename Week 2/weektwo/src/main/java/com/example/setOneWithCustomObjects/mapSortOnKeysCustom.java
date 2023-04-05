package com.example.setOneWithCustomObjects;

import java.util.Map;
import java.util.TreeMap;

public class mapSortOnKeysCustom {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "abc", "abc@gm.com");
        Employee e2 = new Employee(2, "mno", "mno@gm.com");
        Employee e3 = new Employee(3, "lkj", "lkj@gm.com");

        Map<Integer, Employee> map1 = new TreeMap<>(); // maintains ascending order

        map1.put(12, e1);
        map1.put(44, e2);
        map1.put(15, e3);
        map1.put(61, e1);
        map1.put(3, e3);

        display(map1);
    }

    static void display(Map<Integer, Employee> map1) {
        for (Integer i : map1.keySet()) {
            System.out.print("Key: " + i);
            Employee employee = map1.get(i);

            System.out.println(" Value: " + employee.id + ", " + employee.name + ", " + employee.email);
        }
    }
}