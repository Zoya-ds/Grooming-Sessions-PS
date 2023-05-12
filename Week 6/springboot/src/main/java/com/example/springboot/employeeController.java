package com.example.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class employeeController {

    @Autowired
    employeeService service;

    @GetMapping("/save")
    public String saveNewEmployee(@RequestParam String name) {
        Employee e = new Employee();
        e.setEname(name);
        service.saveEmployee(e);

        return "Employee " + name + " has been added successfully";
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") int id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/error")
    public String showError() {
        return "An error has occured";
    }
}
