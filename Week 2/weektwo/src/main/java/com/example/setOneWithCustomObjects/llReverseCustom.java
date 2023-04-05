//Write a Java program to iterate a linked list in reverse order.

package com.example.setOneWithCustomObjects;

import java.util.Iterator;
import java.util.LinkedList;

public class llReverseCustom {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "a", "a@gm.com");
        Employee e2 = new Employee(2, "c", "c@gm.com");
        Employee e3 = new Employee(3, "b", "b@gm.com");

        LinkedList<Employee> linkedList = new LinkedList<>();

        linkedList.add(e1);
        linkedList.add(e2);
        linkedList.add(e3);
        linkedList.add(e2);

        System.out.println("Original ll: ");
        display(linkedList);

        // reversed
        LinkedList<Employee> reversedLinkedList = new LinkedList<>();

        System.out.println("Reversed ll: ");
        Iterator<Employee> descItr = linkedList.descendingIterator();
        while (descItr.hasNext()) {
            reversedLinkedList.add((Employee) descItr.next());
        }

        display(reversedLinkedList);
        // can be done using listIterator.hasprevious()
    }

    static void display(LinkedList<Employee> ll) {
        for (Employee employee : ll) {
            System.out.println(employee.id + ", " + employee.name + ", " + employee.email);
        }
    }
}
