package com.example.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Fruits implements Item {

    private String fruitName;
    private int pricePerKg;
    private int weight;

    @Override
    public int addToCart(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
