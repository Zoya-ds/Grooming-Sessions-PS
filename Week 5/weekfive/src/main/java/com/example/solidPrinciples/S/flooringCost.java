package com.example.solidPrinciples.S;

public class flooringCost {

    areaCalculator areaCalculator = new areaCalculator();

    public int costOfFlooring(Object o) {

        int cost = 10 * areaCalculator.area(o);
        return cost;

    }
}
