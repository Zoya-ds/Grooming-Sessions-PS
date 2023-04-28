package com.example.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String grade;
    private double lastPrecentage;
}
