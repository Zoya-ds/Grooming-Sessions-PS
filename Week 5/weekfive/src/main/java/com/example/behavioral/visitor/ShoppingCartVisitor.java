package com.example.behavioral.visitor;

public interface ShoppingCartVisitor {
    int visit(Book book);

    int visit(Fruits fruits);
}
