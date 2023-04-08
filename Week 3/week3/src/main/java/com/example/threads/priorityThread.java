package com.example.threads;

public class priorityThread {

    public static void main(String[] args) {

        Thread thread1 = new Thread();

        System.out.println(thread1.getPriority());

        thread1.setPriority(1);
        System.out.println(thread1.getPriority());

        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        // System.out.println(thread1.getPriority());
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());

    }
}
