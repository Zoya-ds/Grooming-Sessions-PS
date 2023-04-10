//1.	Write a program to create Thread using Thread class.
package com.example.threads;

public class createThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i + " " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        createThread thread1 = new createThread();

        // thread1.run(); // does not start a new thread and proceed with the main
        // thread
        // thread1.start(); // starts a separate thread

        createThread thread2 = new createThread();
        System.out.println(thread2.getName());
        System.out.println(thread2.getState());

        thread1.start();
        thread2.start();
        // thread2.start(); //Illegal Thread State Exception

        Thread thread3 = new Thread(new createThread(), "Thread 4");
        thread3.start();

        for (int i = 1; i <= 3; i++) {
            createThread thread4 = new createThread();
            thread4.start();
        }

    }
}
