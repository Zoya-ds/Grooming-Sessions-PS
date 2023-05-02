package com.example.structural.bridge;

public class Square extends Shape {

    Square(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Color of the square: ");
        color.applyColor();
    }

}
