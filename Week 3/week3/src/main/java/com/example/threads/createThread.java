package com.example.threads;

public class createThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running.");
    }

    @Override
    public synchronized void start() {
        System.out.println("Starting the thread...");
    }

    public static void main(String[] args) throws InterruptedException {

        createThread thread1 = new createThread();
        thread1.start();
        thread1.run();

        Thread thread2 = new Thread("Thread 2");
        System.out.println(thread2.getState());
        thread2.start();
        // thread2.start(); //Illegal Thread State Exception

        System.out.println(thread2.getName());
        System.out.println(thread2.getState());

        Runnable r1 = new Thread();
        Thread thread3 = new Thread(r1, "Thread 3");
        thread3.start();

        Thread.sleep(3000);
        thread1.run();

        ThreadGroup threadGroup = new ThreadGroup("new pool of threads");
        Thread thread4 = new Thread(threadGroup, "One");
        Thread thread5 = new Thread(threadGroup, "Two");

        System.out.println(thread1.getName() + " " + thread1.getThreadGroup());
        System.out.println(thread2.getName() + " " + thread2.getThreadGroup());
        System.out.println(thread3.getName() + " " + thread3.getThreadGroup());
        System.out.println(thread4.getName() + " " + thread4.getThreadGroup());
        System.out.println(thread5.getName() + " " + thread5.getThreadGroup() + Thread.currentThread());

    }
}
