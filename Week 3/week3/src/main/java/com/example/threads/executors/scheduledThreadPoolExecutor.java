package com.example.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.threads.createThread;
import com.example.threads.createThreadRunnable;

public class scheduledThreadPoolExecutor {

    public static void main(String[] args) {

        // a task that needs to be run at regular intervals
        ExecutorService executorService1 = Executors.newScheduledThreadPool(2);

        executorService1.execute(new createThread());
        executorService1.execute(new Thread(new createThreadRunnable()));
        executorService1.shutdown();

    }

}
