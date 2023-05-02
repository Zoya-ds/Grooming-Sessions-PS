package com.example.structural.bridge;

public class Circle extends Shape {

    public Circle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Color of the circle: ");
        color.applyColor();
    }

}
