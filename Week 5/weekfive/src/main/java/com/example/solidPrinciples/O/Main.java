package com.example.solidPrinciples.O;

public class Main {

    public static void main(String[] args) {
        // areaCalculator areaCalculator = new areaCalculator();
        Circle circle = new Circle(7);
        Square square = new Square(5);
        Cube cube = new Cube(4);

        System.out.println(circle.area());
        System.out.println(square.area());
        System.out.println(cube.area());

        // System.out.println(areaCalculator.costOfFlooring(square));

    }
}
