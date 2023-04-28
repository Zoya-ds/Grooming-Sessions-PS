package com.example.solidPrinciples.I;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Circle implements IShape {

    private int radius;

    @Override
    public int area() {
        return (int) (Math.PI * (Math.pow(radius, 2)));
    }

}
