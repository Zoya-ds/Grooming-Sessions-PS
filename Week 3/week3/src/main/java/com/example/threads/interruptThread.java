//3.	Write a program to interrupt a Thread.
package com.example.threads;

public class interruptThread implements Runnable {

    @Override
    public void run() {
        // try {
        System.out.println("thread has started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted..." + e);
        }
        System.out.println("thread is running again");

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new interruptThread());

        thread1.start();
        try {
            thread1.interrupt();
        } catch (Exception e) {
            System.out.println("Exception caught " + e.getMessage());
        }
    }
}
