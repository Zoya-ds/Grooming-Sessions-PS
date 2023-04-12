package com.example.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.threads.createThreadRunnable;

public class cachedThreadPoolExecutor {

    public static void main(String[] args) throws InterruptedException {

        // for short-lived parallel tasks to be executed
        // if idle for 60 seconds, then are terminated and removed from cached.
        ExecutorService executorService1 = Executors.newCachedThreadPool();

        executorService1.execute(new Thread(new FirstTask()));
        executorService1.execute(new Thread(new createThreadRunnable()));

        Thread.sleep(61000);

        executorService1.execute(new Thread(new SecondTask()));
        executorService1.shutdown();

    }
}

class FirstTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted...");
        }
        System.out.println("First task completed " + Thread.currentThread().getId());

    }

}

class SecondTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted...");
        }
        System.out.println("Second task completed " + Thread.currentThread().getId());

    }

}