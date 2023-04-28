package com.example.solidPrinciples.L;

public class NoShape implements IShape {

    @Override
    public int area() {
        throw new IllegalStateException("Invalid shape!"); // ShapeNotFoundException("Please provide a shape for
                                                           // calculating the
        // area");

    }

}
