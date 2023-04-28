package com.example.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Square implements IShape {

    private int edge;

    @Override
    public int area() {
        return (int) Math.pow(edge, 2);
    }

}
