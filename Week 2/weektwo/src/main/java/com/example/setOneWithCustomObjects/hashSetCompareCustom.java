//Write a Java program to compare two hash set of custom objects
package com.example.setOneWithCustomObjects;

import java.util.HashSet;

public class hashSetCompareCustom {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "abc", "abc@gm.com");
        Employee e2 = new Employee(2, "mno", "mno@gm.com");
        Employee e3 = new Employee(3, "lkj", "lkj@gm.com");

        HashSet<Employee> hashSet1 = new HashSet<>();
        hashSet1.add(e1);
        hashSet1.add(e2);
        hashSet1.add(e3);

        HashSet<Employee> hashSet2 = new HashSet<>();
        hashSet2.add(e1);
        hashSet2.add(e2);
        hashSet2.add(e3);
        hashSet2.add(e2);
        hashSet2.add(e1);

        System.out.println(hashSet1.equals(hashSet2));

        hashSet2.add(new Employee(4, null, null));
        System.out.println(hashSet1.equals(hashSet2));
    }

}
