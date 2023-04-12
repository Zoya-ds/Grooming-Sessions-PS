package com.example.threads.futureObjnCallable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class multiFutureObj {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Future<String> result = executorService.submit(new callableTask("A"));
        // System.out.println(result.get());

        // result = executorService.submit(new callableTask("B"));
        // System.out.println(result.get());

        List<callableTask> multiTasks = List.of(new callableTask("a"),
                new callableTask("b"),
                new callableTask("c"));

        List<Future<String>> multiResults = executorService.invokeAll(multiTasks); // waits for all tasks to be
                                                                                   // completed
        // then return the results

        for (Future<String> future : multiResults) {
            System.out.println(future.get());
        }

        String anyResult = executorService.invokeAny(multiTasks); // returns the result of the task which is
                                                                  // completed first
        System.out.println("Any result: " + anyResult);

        System.out.println("Main completed");
        executorService.shutdown();
    }
}
