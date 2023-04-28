package com.example.creational.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle(5);

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square(4);
        }

        return null;
    }
}
