//Write a Java program to get the first and last occurrence of the specified object in a linked list

package com.example.setOneWithCustomObjects;

import java.util.LinkedList;

public class firstLastOccurrenceCustom {

    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();

        // linkedList.add(new Employee(1, "abc", "abc@gm.com"));
        // linkedList.add(new Employee(2, "mno", "mno@gm.com"));
        // linkedList.add(new Employee(1, "abc", "abc@gm.com"));
        // linkedList.add(new Employee(3, "lkj", "lkj@gm.com"));

        // Employee e = new Employee(1, "abc", "abc@gm.com");
        // couldn't find Employee e because different object references

        Employee e1 = new Employee(1, "a", "a@gm.com");
        Employee e2 = new Employee(2, "c", "c@gm.com");
        Employee e3 = new Employee(3, "b", "b@gm.com");

        linkedList.add(e3);
        linkedList.add(e3);
        linkedList.add(e1);
        linkedList.add(e2);
        linkedList.add(e3);
        linkedList.add(e1);

        Employee e = e3; // element to be searched

        int firstPos = -1, lastPos = -1;
        int index = 0;

        for (Employee i : linkedList) {

            if (i.equals(e)) {
                if (firstPos == -1)
                    firstPos = index;

                lastPos = index;
            }

            index++;
        }

        if (firstPos == -1)
            System.out.println("Object is not present in the linked list!");
        else {
            System.out.println("First occurence: " + firstPos);
            System.out.println("Last Occurence: " + lastPos);
            System.out.println("Object details: " + linkedList.get(firstPos));
        }
    }
}
