package com.example.solidPrinciples.I;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cube implements IShape, threeDimensionalShape {

    private int edge;

    @Override
    public int area() {

        return (int) (6 * Math.pow(edge, 2));
    }

    @Override
    public int volume() {
        return (int) Math.pow(edge, 3);
    }

}
