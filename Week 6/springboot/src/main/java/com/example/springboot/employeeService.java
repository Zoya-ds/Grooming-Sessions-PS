package com.example.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeService {

    @Autowired
    employeeRepository repository;

    public void saveEmployee(Employee e) {
        repository.save(e);
    }

    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(int eid) {
        return repository.findById(eid);
    }
}
