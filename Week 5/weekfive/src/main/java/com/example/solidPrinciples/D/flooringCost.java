package com.example.solidPrinciples.D;

public class flooringCost {

    private IareaCalculator areaCalculator;

    flooringCost(IareaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public int costOfFlooring(Object o) {

        int cost = 10 * areaCalculator.area(o);
        return cost;

    }
}
