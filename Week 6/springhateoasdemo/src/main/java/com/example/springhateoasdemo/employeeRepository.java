package com.example.springhateoasdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Integer> {

    default Employee findByName(String name) {

        for (Employee e : findAll()) {
            if (e.getEName().equalsIgnoreCase(name))
                return e;
        }

        return null;

    }
}
