package com.example.forkAndJoinQues;

//Write a fork and join program to sum all the numbers from a range.- RecursiveTask
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class sumOfRange extends RecursiveTask<Integer> {

    private int n;
    volatile int result = 0;

    sumOfRange(int n) {
        this.n = n;
    }

    protected Integer compute() {
        if (n == 0)
            return 0;

        System.out.println(n);
        return n + (new sumOfRange(n - 1)).fork().join();

        // sumOfRange s1 = new sumOfRange(n);
        // sumOfRange s2 = new sumOfRange(n);
        // s1.fork();
        // s2.fork();

    }

    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        sumOfRange sumOfRange = new sumOfRange(6);

        int result = forkJoinPool.invoke(sumOfRange); // await and obtain result

        System.out.println(result);
    }
}
