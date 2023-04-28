package com.example.creational.factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        System.out.println(shape1.area());
        Shape shape2 = shapeFactory.getShape("SQUARE");
        System.out.println(shape2.area());

    }
}
