//3.	Write a program to interrupt a Thread.
package com.example.threads;

public class interruptThread implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("thread has started");
            Thread.sleep(3000);
            System.out.println("thread is running again");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted..." + e);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new interruptThread());

        thread1.start();
        try {
            thread1.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.interrupt(); // for waking up a thread while sleeping
        // can be used with wait, join and sleep
        // but sleep can only be interrupted
        // whereas wait can be interrupted by interrupt, notify or notifyAll
    }
}
