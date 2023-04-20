package com.example;

//Given a list of integers, find the maximum value element present in it using Stream functions?
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class maxValue {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 5, 9, 1, 7, 3, 8, 6, 9, 0, 4);
        // List<Integer> list = new ArrayList<>();

        Optional<Integer> maxInt = list.stream().max((a, b) -> a - b);
        Integer maxNum = list.stream().max((a, b) -> a - b).orElse(99).intValue();

        if (maxInt.isPresent())
            System.out.println(maxInt.get() + " " + maxNum); // maxInt.get() will throw a NoSuchElement exception if
                                                             // object is empty

        else {
            System.out.println(maxNum);
            System.out.println(maxInt.isPresent());
        }
    }

}
