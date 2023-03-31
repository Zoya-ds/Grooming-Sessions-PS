package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sortArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements: ");

        while (true) {
            String ss = sc.next();
            if (ss.equals("done"))
                break;
            arrList.add(Integer.parseInt(ss));
        }
        sc.close();

        ArrayList<Integer> arrList2 = new ArrayList<>(arrList);

        System.out.println("Original: " + arrList); // maintains insertion order

        // Sort method 1
        arrList.sort(new SortComp());
        System.out.println("Sorted 1:" + arrList);

        // Sort method 2
        Collections.sort(arrList2);
        System.out.println("Sorted 2: " + arrList2);

    }
}

class SortComp implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {

        return a - b;
    }
}
