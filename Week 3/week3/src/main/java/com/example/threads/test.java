package com.example.threads;

// Java program to illustrate class level lock
public class test implements Runnable {

    public void run() {
        Lock();
    }

    public void Lock() {
        System.out.println(
                Thread.currentThread().getName());
        synchronized (test.class) {
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName());
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName()
                            + " end");
        }
    }

    public static void main(String[] args) {
        test g1 = new test();
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g1);
        test g2 = new test();
        Thread t3 = new Thread(g2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
