//Program to add, retrieve & remove element from ArrayList

package com.example.setOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arrayListOps {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>(); // can define intial capacity

        System.out.println();

        // add elements: method 1
        arrList.add(1);
        arrList.add(4);
        arrList.add(3);
        arrList.addAll(Arrays.asList(0, 2, 9, 7));
        // add elements: method 2
        arrList.add(1, 5);

        System.out.println(arrList); // maintains insertion order

        // add elements: method 3
        ArrayList<Integer> arrList2 = new ArrayList<>(arrList);
        arrList2.add(8);
        System.out.println(arrList2); // retrieval: method 1

        // retrieval: method 2

        System.out.println(arrList2.get(2));

        arrList.set(2, 7);
        System.out.println(arrList2);

        // retrieval: method 3
        System.out.println("1st list: ");
        Iterator<Integer> itr = arrList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // retrieval: method 4
        System.out.println("2nd list: ");
        for (Integer it : arrList2) {
            System.out.println(it);
        }

        // remove an element: method 1
        arrList2.remove(2); // element at given index
        System.out.println(arrList2);

        // remove an element: method 3
        arrList2.removeAll(arrList); // removes common elements
        System.out.println(arrList2);

    }
}

// create a custom object and try to remove it without overriding the equals
// method
// primitive datatypes is not allowed because collections means a group of
// objects and wrapper classes convert primitive datatypes into objects.
// Example- int to Integer
// implement all Collection objects with custom objects