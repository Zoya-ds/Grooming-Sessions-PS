package com.example.threads;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class futureObjNCallable implements Callable<String> {

    @Override
    public String call() {
        return "Hey";
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Future<String>> list = new ArrayList<>();

        Callable<String> callable = new futureObjNCallable();

        for (int i = 0; i < 100; i++) {
            Future<String> future = executorService.submit(callable);
            list.add(future);
        }
        for (Future<String> fut : list) {
            try {
                System.out.println(fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
