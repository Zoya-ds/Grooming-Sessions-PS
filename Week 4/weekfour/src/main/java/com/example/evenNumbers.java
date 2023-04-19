package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 5, 9, 1, 7, 3, 8, 6, 9, 0, 4);

        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        // stream.allMatch(i-> i%2==0) ------false
        // anyMatch, noneMatch
    }

}
