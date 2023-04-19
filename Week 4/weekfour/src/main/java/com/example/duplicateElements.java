package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class duplicateElements {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 2, 7, 7, 7, 0, 0, 1, 1, 1, 1, 9, 5, 6, 4, 3, 3);

        // Integer i = list.stream().max((a, b) -> a - b).orElse(10);// .forEach(i ->
        // System.out.println(i));

        list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .distinct()
                .forEach(i -> System.out.println(i));
    }

}
