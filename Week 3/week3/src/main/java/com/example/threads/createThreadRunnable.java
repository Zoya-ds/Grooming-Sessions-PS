//Write a program to create Thread using Runnable interface
package com.example.threads;

public class createThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        createThreadRunnable createThreadRunnable = new createThreadRunnable();
        createThreadRunnable.run(); // works
        // thread.start(); //not found

        Thread thread1 = new Thread(createThreadRunnable);
        thread1.start(); // begins a new thread, voila!

        Thread thread2 = new Thread(createThreadRunnable);
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread1.isAlive() + " " + thread2.isAlive());
    }
}
