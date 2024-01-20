package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {
    private String name;
    private int age;

    public abstract void displayDetails();
    public abstract void updatePerson(String name, int age);
}
