package com.example.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.threads.createThread;
import com.example.threads.createThreadRunnable;
import com.example.threads.tasks.TaskOne;
import com.example.threads.tasks.TaskTwo;

public class fixedThreadPoolExecutor {

    public static void main(String[] args) {

        // a thread pool of a fixed number of threads..
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);

        executorService1.execute(new createThread());
        executorService1.execute(new Thread(new createThreadRunnable()));
        executorService1.execute(new Thread(new TaskOne()));
        executorService1.execute(new Thread(new TaskTwo()));

        executorService1.shutdown();

    }
}
