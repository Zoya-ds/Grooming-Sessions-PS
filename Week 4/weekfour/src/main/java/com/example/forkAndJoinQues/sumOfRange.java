package com.example.forkAndJoinQues;

//Write a fork and join program to sum all the numbers from a range.- RecursiveTask
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class sumOfRange extends RecursiveTask<Integer> {

    private int n;

    sumOfRange(int n) {
        this.n = n;
    }

    protected Integer compute() {
        int result = 0;

        while (n > 0) {
            result += n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        sumOfRange sumOfRange = new sumOfRange(10);

        int result = forkJoinPool.invoke(sumOfRange);
        System.out.println(result);
    }
}
