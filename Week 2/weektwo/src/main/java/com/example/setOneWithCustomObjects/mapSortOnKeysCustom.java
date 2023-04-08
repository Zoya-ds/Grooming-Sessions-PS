package com.example.setOneWithCustomObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapSortOnKeysCustom {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "abc", "abc@gm.com");
        Employee e2 = new Employee(2, "mno", "mno@gm.com");
        Employee e3 = new Employee(3, "lkj", "lkj@gm.com");

        Map<Integer, Employee> map1 = new TreeMap<>(); // maintains ascending order
        // map1.computeIfAbsent(null, null)
        // map1.putIfAbsent(null, e3)

        map1.put(12, e1);
        map1.put(44, e2);
        map1.put(15, e3);
        map1.put(61, e1);
        map1.put(3, e3);

        System.out.println("Sorted Treemap: ");
        display(map1);

        Map<Integer, Employee> map2 = new HashMap<>();

        map2.put(12, e1);
        map2.put(44, e2);
        map2.put(15, e3);
        map2.put(61, e1);
        map2.put(3, e3);

        ArrayList<Map.Entry> arrayList = new ArrayList<>(map2.entrySet());

        Collections.sort(arrayList, new Comparator<Map.Entry>() {
            public int compare(Map.Entry a, Map.Entry b) {
                return (int) a.getKey() - (int) b.getKey();
            }
        });
        System.out.println("Sorted Hashmap: ");
        for (Map.Entry entry : arrayList) {
            Employee e = (Employee) entry.getValue();
            System.out.println(entry.getKey() + ": " + e.id + ", " + e.name + ", " + e.email);
        }

    }

    static void display(Map<Integer, Employee> map1) {
        for (Integer i : map1.keySet()) {
            System.out.print("Key: " + i);
            Employee employee = map1.get(i);

            System.out.println(" Value: " + employee.id + ", " + employee.name + ", " + employee.email);
        }
    }
}