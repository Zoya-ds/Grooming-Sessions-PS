package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();

        Employee e1 = new Employee("A", "A@xyz.com");
        Employee e2 = new Employee("B", "B@xyz.com");

        entityManager.getTransaction().begin(); // initializing the manager, begin() starts the transaction
        entityManager.persist(e1);
        entityManager.persist(e2);

        entityManager.getTransaction().commit();

        Employee e = entityManager.find(Employee.class, 1);
        System.out.println(e.getId() + " " + e.getName() + " " + e.getEmail());
        entityManager.close();

    }
}
