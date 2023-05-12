package com.example.springhateoasdemo;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Employee extends RepresentationModel<Employee> {

    @Id
    @GeneratedValue
    private int eId;

    private String eName;

}
