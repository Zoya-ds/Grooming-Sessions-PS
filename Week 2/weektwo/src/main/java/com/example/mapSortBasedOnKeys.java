package com.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapSortBasedOnKeys {

    public static void main(String[] args) {

        // Map<Integer, String> map1 = new LinkedHashMap<>(); // maintains insertion
        // order
        Map<Integer, String> map1 = new HashMap<>(); // sort based on keys

        // Map<Integer, String> map1 = new TreeMap<>(); // maintains ascending order

        map1.put(2, "B");
        map1.put(4, "A");
        map1.put(1, "W");
        map1.put(6, "K");
        map1.put(3, "C");

        System.out.println(map1);
    }
}
