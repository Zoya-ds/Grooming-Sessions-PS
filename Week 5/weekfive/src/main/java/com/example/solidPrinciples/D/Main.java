package com.example.solidPrinciples.D;

public class Main {

    public static void main(String[] args) {
        IareaCalculator areaCalculator = new areaCalculator();
        Circle circle = new Circle(7);
        Square square = new Square(5);
        flooringCost flooringCost = new flooringCost(areaCalculator);

        System.out.println(areaCalculator.area(circle));
        System.out.println(areaCalculator.area(square));

        System.out.println(flooringCost.costOfFlooring(circle));
        System.out.println(flooringCost.costOfFlooring(square));

    }
}
