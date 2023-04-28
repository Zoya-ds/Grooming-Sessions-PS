package com.example.solidPrinciples.O;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cube implements IShape {

    private int edge;

    @Override
    public int area() {

        return (int) (6 * Math.pow(edge, 2));
    }

}
