package com.example.springhateoasdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class employeeService {

    @Autowired
    employeeRepository repository;

    @Transactional
    public void saveEmployee(Employee e) {
        repository.save(e);
    }

    @Transactional(readOnly = true)
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Employee getEmployeeById(int eid) {
        return repository.findById(eid).get();
    }

    @Transactional(readOnly = true)
    public Employee getEmployeeByName(String name) {
        return repository.findByName(name);
    }
}
