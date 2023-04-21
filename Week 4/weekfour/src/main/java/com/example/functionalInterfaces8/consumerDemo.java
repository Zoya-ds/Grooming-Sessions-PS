package com.example.functionalInterfaces8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.example.Employee;

public class consumerDemo implements Consumer {

    @Override
    public void accept(Object t) {
        System.out.println(t.getClass());
    }

    public static void main(String[] args) {

        List<Employee> list = createEmployees();

        consumerDemo consumerDemo = new consumerDemo();

        // consumerDemo.accept(new Employee(2, "N", 1000));
        list.stream().forEach(consumerDemo);

        Consumer<Employee> c = new Consumer<Employee>() {

            @Override
            public void accept(Employee t) {
                System.out.println(t.getName());
            }
        };

        list.stream().forEach(c);

        biconsumerDemo biconsumerDemo = new biconsumerDemo();
        list.stream();

    }

    public static List<Employee> createEmployees() {
        Employee e1 = new Employee(1, "a", 1000);
        Employee e2 = new Employee(2, "b", 1500);
        Employee e3 = new Employee(3, "c", 10000);
        Employee e4 = new Employee(4, "d", 700);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);

        return list;
    }
}

class biconsumerDemo implements BiConsumer {
    @Override
    public void accept(Object t, Object u) {
        Employee e1 = (Employee) t;
        Employee e2 = (Employee) u;

        System.out.println(e1.getName() + "----" + e2.getName());
    }
}