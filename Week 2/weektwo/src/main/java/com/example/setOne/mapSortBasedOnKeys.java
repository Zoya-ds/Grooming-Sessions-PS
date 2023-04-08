//Program to sort a map based on keys.

package com.example.setOne;

import java.util.Map;
import java.util.TreeMap;

public class mapSortBasedOnKeys {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new TreeMap<>(); // maintains ascending order

        map1.put(12, "B");
        map1.put(44, "A");
        map1.put(15, "W");
        map1.put(61, "K");
        map1.put(3, "C");

        System.out.println(map1);

    }
}

// can be sort using arrayList
// store keys in an arrayList, sort it and then create a new Map based on the
// sorted keys