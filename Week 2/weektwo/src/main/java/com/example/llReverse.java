package com.example;

import java.util.Iterator;
import java.util.LinkedList;

public class llReverse {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(4);
        linkedList.add(1);

        System.out.println(linkedList);

        // reversed
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();

        Iterator descItr = linkedList.descendingIterator();
        while (descItr.hasNext()) {
            reversedLinkedList.add((Integer) descItr.next());
        }

        System.out.println(reversedLinkedList);
    }
}
