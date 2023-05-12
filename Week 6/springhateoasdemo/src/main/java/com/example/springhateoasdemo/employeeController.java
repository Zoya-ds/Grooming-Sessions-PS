package com.example.springhateoasdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
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
        e.setEName(name);
        service.saveEmployee(e);

        return "Employee " + name + " has been added successfully";
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/Id/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
        Employee employee = service.getEmployeeById(id);

        employee.add(linkTo(methodOn(employeeController.class).getEmployeeById(id)).withSelfRel());
        employee.add(linkTo(methodOn(employeeController.class).getAllEmployees()).withRel("For All employees"));
        employee.add(linkTo(methodOn(employeeController.class).getEmployeeByName(employee.getEName()))
                .withRel("Employee by name"));

        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Employee> getEmployeeByName(@PathVariable("name") String name) {
        Employee employee = service.getEmployeeByName(name);

        employee.add(linkTo(methodOn(employeeController.class).getEmployeeByName(name)).withSelfRel());
        employee.add(linkTo(methodOn(employeeController.class).getAllEmployees()).withRel("For All employees"));
        employee.add(linkTo(methodOn(employeeController.class).getEmployeeById(employee.getEId()))
                .withRel("Employee by id"));

        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @GetMapping("/error")
    public String showError() {
        return "An error has occured";
    }
}
