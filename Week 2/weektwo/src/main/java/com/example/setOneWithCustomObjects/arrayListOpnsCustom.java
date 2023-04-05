//Program to add, retrieve & remove element from ArrayList using Custom object

package com.example.setOneWithCustomObjects;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListOpnsCustom {

    public static void main(String[] args) {

        ArrayList<Employee> arrList = new ArrayList<>(); // can define intial capacity
        Employee e1 = new Employee(4, "d", "d@gm.com");
        Employee e2 = new Employee(5, "e", "e@gm.com");

        // add elements: method 1
        arrList.add(e1);
        arrList.add(new Employee(1, "a", "abc@gm.com"));
        arrList.add(new Employee(2, "b", "b@gm.com"));
        arrList.add(new Employee(3, "c", "c@gm.com"));
        arrList.addAll(Arrays.asList(e1, e2));

        Employee e3 = new Employee(99, "z", "z@gm.com");
        // add elements: method 2
        arrList.add(1, e3);

        // retrieval: method 1 -----doesn't work appropriately
        System.out.println("gives object references");
        System.out.println(arrList); // displays object references

        // add elements: method 3
        ArrayList<Employee> arrList2 = new ArrayList<>(arrList);
        arrList2.add(new Employee(6, "f", "f@gmail.com"));

        // retrieval: method 2
        System.out.println("\n" + arrList2.get(2).id);
        System.out.println(arrList2.get(2).name);
        System.out.println(arrList2.get(2).email);

        // retrieval: method 3
        System.out.println("\n2nd list: ");
        for (Employee it : arrList2) {
            System.out.print(it.id + ", ");
            System.out.print(it.name + ", ");
            System.out.println(it.email);
        }

        arrList.set(2, new Employee(9, "l", "l@gm.com"));
        // retrieval: method 3
        System.out.println("\n1st list: ");
        arrList.forEach(
                (employee) -> System.out.println(employee.id + ", " + employee.name + ", " + employee.email));

        // remove an element: method 1
        arrList2.remove(2); // element at given index
        System.out.println("\nRemoved element at index 2:");
        display(arrList2);

        // remove an element: method 2
        arrList.remove(e1); // removes the first occurrence of the object
        display(arrList);

        // remove an element: method 3
        arrList2.removeAll(arrList); // removes common elements
        display(arrList2);

    }

    static void display(ArrayList<Employee> arrayList) {
        arrayList.forEach(
                (employee) -> System.out.println(employee.id + ", " + employee.name + ", " +
                        employee.email));
    }
}