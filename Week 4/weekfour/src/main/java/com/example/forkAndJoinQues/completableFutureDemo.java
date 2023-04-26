package com.example.forkAndJoinQues;

//Write a program to run a simple asynchronous stage using CompletableFuture.
//Run a task asynchronously and return the result ?

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class completableFutureDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable r1 = () -> {
            System.out.println("Thread: " + Thread.currentThread().getName());

            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        };

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(r1);
        completableFuture.get();

        CompletableFuture.runAsync(r1, executorService).get();
        System.out.println("runAsync is over");

        Supplier<String> s1 = () -> {
            System.out.println("Thread: " + Thread.currentThread().getName());

            for (int i = 0; i <= 5; i += 2)
                System.out.println(i);
            return "supplyAsync completed";
        };

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(s1);
        System.out.println(completableFuture2.get());

        Supplier<String> s2 = () -> {
            System.out.println("Thread: " + Thread.currentThread().getName());

            try {
                System.out.println(completableFuture2.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            return "--------------completed";
        };

        System.out.println(CompletableFuture.supplyAsync(s2, executorService).get());

        executorService.shutdown();
    }
}