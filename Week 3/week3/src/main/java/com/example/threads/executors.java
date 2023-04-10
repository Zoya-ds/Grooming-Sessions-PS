package com.example.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executors {

    public static void main(String[] args) {

        // is used to execute tasks in a sequential manner.
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        // a thread pool of a fixed number of threads.
        ExecutorService executorService2 = Executors.newFixedThreadPool(3);

        // for short-lived parallel tasks to be executed
        // if idle for 60 seconds, then are terminated and removed from cached.
        ExecutorService executorService3 = Executors.newCachedThreadPool();

        // a task that needs to be run at regular intervals
        ExecutorService executorService4 = Executors.newScheduledThreadPool(3);

    }
}
