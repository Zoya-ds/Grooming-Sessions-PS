package com.example.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class employeeTest {

    @Test
    public void creationOfNewEmployeeTest() {
        Employee e = createANewEmployee();

        assertEquals(0, e.getEid());
        assertEquals(null, e.getEname());
    }

    @Test
    public void setNameOfEmployeeTest() {
        Employee e = createANewEmployee("abc");
        assertEquals("abc", e.getEname());
    }

    private Employee createANewEmployee() {
        Employee e = new Employee();

        return e;
    }

    private Employee createANewEmployee(String name) {
        Employee e = new Employee();
        e.setEname(name);
        return e;
    }

}
