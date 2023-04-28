package com.example.solidPrinciples.L;

public class Main {

    public static void main(String[] args) {
        // areaCalculator areaCalculator = new areaCalculator();
        Circle circle = new Circle(7);
        NoShape noShape = new NoShape();

        System.out.println(circle.area());
        System.out.println(noShape.area());

    }
}
