//Program to Implement LinkedList

package com.example.setOneWithCustomObjects;

import java.util.ArrayList;
import java.util.Arrays;

public class llImplCustom {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "a", "a@gm.com");
        Employee e2 = new Employee(2, "c", "c@gm.com");
        Employee e3 = new Employee(3, "b", "b@gm.com");
        Employee e4 = new Employee(4, "d", "d@gm.com");

        ArrayList<Employee> arrayList = new ArrayList<>(Arrays.asList(e1, e2, e3, e4));

        // add elements
        NodeCustom head = addElements(arrayList);

        // displaying elements
        display(head);

        // searching element
        Employee e = e3;
        System.out.print("Element to search: ");
        displayElement(e);
        searchElement(head, e3);

        // removing element
        e = e2;
        System.out.print("Element to remove: ");
        displayElement(e);
        removeElement(head, e);
    }

    static NodeCustom addElements(ArrayList<Employee> arrayList) {
        NodeCustom head = new NodeCustom(arrayList.get(0));
        NodeCustom ptr = head;

        arrayList.remove(0);
        for (Employee emp : arrayList) {
            NodeCustom temp = new NodeCustom(emp);
            ptr.next = temp;
            ptr = ptr.next;
        }

        return head;
    }

    static void display(NodeCustom head) {

        NodeCustom ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data.id + ", " + ptr.data.name + ", " + ptr.data.email);
            ptr = ptr.next;
        }
    }

    static void searchElement(NodeCustom head, Employee element) {

        NodeCustom ptr = head;
        int pos = 0;
        while (ptr != null) {
            if (ptr.data == element) {
                System.out.println("Required element found at index " + pos);
                break;
            }
            ptr = ptr.next;
            pos++;
        }

        if (ptr == null)
            System.out.println("element not found!");

    }

    // only the first occurence will be removed
    static void removeElement(NodeCustom head, Employee element) {

        if (head.data == element) {
            head = head.next;
        } else {

            NodeCustom prev = null;
            NodeCustom ptr = head;

            while (ptr != null) {
                if (ptr.data == element) {
                    prev.next = ptr.next;
                    break;
                }
                prev = ptr;
                ptr = ptr.next;
            }

            if (ptr == null)
                System.out.println("element not found!");
            else {
                System.out.println("Updated linked list:");
                display(head);
            }
        }
    }

    static void displayElement(Employee e) {
        System.out.println(e.id + ", " + e.name + ", " + e.email);
    }
}
