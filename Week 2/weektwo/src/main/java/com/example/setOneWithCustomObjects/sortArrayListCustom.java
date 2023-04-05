package com.example.setOneWithCustomObjects;

import java.util.ArrayList;
import java.util.Comparator;

public class sortArrayListCustom {

    public static void main(String[] args) {
        Employee e1 = new Employee(21, "a", "c@gm.com");
        Employee e2 = new Employee(2, "c", "b@gm.com");
        Employee e3 = new Employee(9, "b", "a@gm.com");

        ArrayList<Employee> arrList = new ArrayList<>();
        arrList.add(e1);
        arrList.add(e2);
        arrList.add(e3);

        System.out.println("Original: "); // maintains insertion order
        display(arrList);

        // Sort method 1
        arrList.sort(new SortById());
        System.out.println("Sorted by Id:");
        display(arrList);

        // Sort method 1
        arrList.sort(new SortByIdDesc());
        System.out.println("Sorted by Id in descending order:");
        display(arrList);

        // Sort method 1
        arrList.sort(new SortByName());
        System.out.println("Sorted by Name:");
        display(arrList);

        // Sort method 1
        arrList.sort(new SortByEmail());
        System.out.println("Sorted by Email:");
        display(arrList);

    }

    static void display(ArrayList<Employee> arrayList) {
        for (Employee employee : arrayList) {
            System.out.println(employee.id + ", " + employee.name + ", " + employee.email);
        }
    }
}

class SortById implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {

        return a.id - b.id;
    }
}

class SortByIdDesc implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {

        return b.id - a.id;
    }
}

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {

        return a.name.compareTo(b.name);
    }
}

class SortByEmail implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {

        return a.email.compareTo(b.email);
    }
}