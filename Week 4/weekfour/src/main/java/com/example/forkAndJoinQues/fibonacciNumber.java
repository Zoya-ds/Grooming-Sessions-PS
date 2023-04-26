package com.example.forkAndJoinQues;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class fibonacciNumber extends RecursiveAction {

    private int n;

    fibonacciNumber(int n) {
        this.n = n;
    }

    @Override
    protected void compute() {

        int result = findFibonacci(n);
        System.out.println(result);

    }

    Integer findFibonacci(int num) {

        if (num <= 1)
            return num;

        return findFibonacci(num - 1) + findFibonacci(num - 2);
    }

    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        fibonacciNumber fibonacciNumber = new fibonacciNumber(8);

        forkJoinPool.invoke(fibonacciNumber);
    }

}
