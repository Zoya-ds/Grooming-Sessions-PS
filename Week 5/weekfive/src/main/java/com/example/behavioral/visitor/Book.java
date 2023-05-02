package com.example.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book implements Item {

    private String bookName;
    private int price;

    @Override
    public int addToCart(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
