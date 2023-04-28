package com.example.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Circle implements Shape {

    private int radius;

    @Override
    public int area() {
        return (int) (Math.PI * (Math.pow(radius, 2)));
    }

}
