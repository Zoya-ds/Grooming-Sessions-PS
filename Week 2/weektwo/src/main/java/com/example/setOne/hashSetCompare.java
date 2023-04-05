//Write a Java program to compare two hash set
package com.example.setOne;

import java.util.HashSet;

public class hashSetCompare {

    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);
        hashSet1.add(5);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(1);
        hashSet2.add(8);
        hashSet2.add(5);
        hashSet2.add(3);

        HashSet<Integer> hashSet3 = new HashSet<>(hashSet1);

        System.out.println(hashSet1.equals(hashSet2));
        System.out.println(hashSet1.equals(hashSet3));
        System.out.println(hashSet2.equals(hashSet3));
    }

}
