package com.example;

import java.util.Scanner;

public class llImpl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // add elements
        Node head = addElements();

        // displaying elements
        display(head);

        // searching element
        System.out.print("Enter element to search: ");
        int num = sc.nextInt();

        searchElement(head, num);

        // removing element
        System.out.print("Enter element to remove: ");
        int num2 = sc.nextInt();
        removeElement(head, num2);

        sc.close();

    }

    static Node addElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        Node head2 = new Node(sc.nextInt());

        Node ptr = new Node(-1);
        ptr = head2;

        while (true) {
            String ss = sc.next();
            if (ss.equals("done"))
                break;

            ptr.next = new Node(Integer.parseInt(ss));
            ptr = ptr.next;
        }

        return head2;
    }

    static void display(Node head) {

        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    static void searchElement(Node head, int element) {

        Node ptr = head;
        int pos = 0;
        while (ptr != null) {
            if (ptr.data == element) {
                System.out.println(ptr.data + " found at index " + pos);
                break;
            }
            ptr = ptr.next;
            pos++;
        }

        if (ptr == null)
            System.out.println("element not found!");

    }

    // only the first occurence will be removed
    static void removeElement(Node head, int element) {

        Node prev = null;
        Node ptr = head;

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
