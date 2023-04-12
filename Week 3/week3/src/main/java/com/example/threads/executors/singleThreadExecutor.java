package com.example.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.threads.createThread;
import com.example.threads.createThreadRunnable;

public class singleThreadExecutor {

    public static void main(String[] args) {

        // is used to execute tasks in a sequential manner.
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        executorService1.execute(new createThread());
        executorService1.execute(new Thread(new createThreadRunnable()));
        executorService1.shutdown();

    }
}
