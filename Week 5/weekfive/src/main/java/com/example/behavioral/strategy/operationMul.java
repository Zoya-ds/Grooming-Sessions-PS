package com.example.behavioral.strategy;

public class operationMul implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}
