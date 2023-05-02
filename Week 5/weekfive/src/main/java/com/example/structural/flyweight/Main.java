package com.example.structural.flyweight;

public class Main {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        for (int i = 0; i < 5; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
