package com.example.solidPrinciples.S;

public class Main {

    public static void main(String[] args) {
        areaCalculator areaCalculator = new areaCalculator();
        Circle circle = new Circle(7);
        Square square = new Square(5);

        System.out.println(areaCalculator.area(circle));
        System.out.println(areaCalculator.area(square));

        // System.out.println(areaCalculator.costOfFlooring(square));

    }
}
