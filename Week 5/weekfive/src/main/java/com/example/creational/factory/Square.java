package com.example.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Square implements Shape {

    private int edge;

    @Override
    public int area() {
        return (int) Math.pow(edge, 2);
    }

}
