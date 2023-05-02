package com.example.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new operationAdd());
        System.out.println(context.executeStrategy(5, 3)); // 5+3=8

        context = new Context(new operationSub());
        System.out.println(context.executeStrategy(5, 3)); // 5-3=2

        context = new Context(new operationMul());
        System.out.println(context.executeStrategy(5, 3)); // 5*3=15

    }
}
