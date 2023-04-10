//4.	Write a program to set the Thread priority.
package com.example.threads;

public class priorityThread {

    public static void main(String[] args) {

        Thread thread1 = new Thread();

        System.out.println(thread1.getName() + " " + thread1.getPriority());

        thread1.setPriority(1);
        System.out.println(thread1.getName() + " " + thread1.getPriority());

        thread1.setPriority(10);
        System.out.println(thread1.getName() + " " + thread1.getPriority());

    }
}
