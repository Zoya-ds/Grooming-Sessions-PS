package com.example;

//Given a list of integers, find out all the even numbers exist in the list using Stream functions?
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class evenNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 5, 9, 1, 7, 3, 8, 6, 9, 0, 4);

        Consumer<Integer> consumer = i -> System.out.println(i);
        Predicate<Integer> predicate = new Predicate<Integer>() {
            public boolean test(Integer t) {
                return t % 2 == 0;
            };
        };
        list.stream().filter(predicate).forEach(consumer);

        List<Integer> evenList = list.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(evenList);

        // stream.allMatch(i-> i%2==0) ------false
        // anyMatch, noneMatch
    }

}
