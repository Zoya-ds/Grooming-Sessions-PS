package com.example.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Employee implements Cloneable {

    private List<String> employees;

    public Employee() {
        employees = new ArrayList<>();
    }

    public Employee(List<String> list) {
        this.employees = list;
    }

    void loadData() {
        employees.add("A");
        employees.add("B");
        employees.add("C");
        employees.add("D");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.employees) {
            temp.add(s);
        }
        return new Employee(temp);
    }
}
