package com.example;

import java.util.LinkedList;
import java.util.Scanner;

public class firstLastOccurenceLL {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(5);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element:");
        int search = sc.nextInt();
        sc.close();

        int firstPos = -1;
        int lastPos = -1;
        int index = 0;

        for (Integer i : linkedList) {

            if (i == search) {
                if (firstPos == -1)
                    firstPos = index;

                lastPos = index;
            }

            index++;
        }

        if (firstPos == -1)
            System.out.println("Element is not present in the linked list!");
        else {
            System.out.println("First occurence: " + firstPos);
            System.out.println("Last Occurence: " + lastPos);
        }
    }
}
