package com.example.structural.bridge;

public class Main {

    public static void main(String[] args) {

        Shape shape1 = new Circle(new blueColor());
        Shape shape2 = new Square(new redColor());
        Shape shape3 = new Square(new greenColor());

        shape1.applyColor();
        shape2.applyColor();
        shape3.applyColor();

    }
}
