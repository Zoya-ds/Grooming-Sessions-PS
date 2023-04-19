package com.example.threads.futureObjnCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class futureObjNCallable {
    public static void main(String[] args) throws InterruptedException, TimeoutException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<String> result = executorService.submit(new callableTask("A"));
        // System.out.println(result);

        System.out.println(result.get());
        // System.out.println(result.get(1000, TimeUnit.MILLISECONDS));

        System.out.println("Main completed");
        // executorService.awaitTermination(0, null); //stops it after the given time
        // period or it has completed execution
        // executorService.shutdownNow(); //stops it forcefully
        executorService.shutdown();

    }
}