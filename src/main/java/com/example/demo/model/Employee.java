package com.example.demo.model;

import com.example.demo.enums.EmployeeType;
import com.example.demo.interfaces.ContractDepartment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person implements ContractDepartment {
    private int employeeId;
    private int contractDuration;
    private String entryDate;
    private int noticePeriod;
    private EmployeeType employeeType;
    private List<Project>projects;

    public Employee(int employeeId,String name, int age, int contractDuration, String entryDate, int noticePeriod, EmployeeType employeeType) {
        super(name, age);
        this.employeeId = employeeId;
        this.contractDuration = contractDuration;
        this.entryDate = entryDate;
        this.noticePeriod = noticePeriod;
        this.employeeType = employeeType;
    }

    public Employee(int employeeId, int contractDuration, String entryDate, int noticePeriod, EmployeeType employeeType) {
        this.employeeId = employeeId;
        this.contractDuration = contractDuration;
        this.entryDate = entryDate;
        this.noticePeriod = noticePeriod;
        this.employeeType = employeeType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
    @Override
    public void updatePerson(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public void setEntryDate(String entryDate) {
        this.entryDate=entryDate;
    }

    @Override
    public void setContractDuration(int contractDuration) {
        this.contractDuration=contractDuration;
    }

    @Override
    public void setNoticePeriod(int noticePeriod) {
        this.noticePeriod=noticePeriod;
    }
    public double calculateSalary(){
        double baseSalary = 0.0;
        switch (employeeType){
            case MANAGER -> {
                baseSalary = 50000.0;
                double bonus = 10000.0;
                return baseSalary + bonus;
            }
            case ENGINEER -> {
                baseSalary=900;
                double hourlyRate = 30.0;
                int hoursWorked = 160;
                return baseSalary + hourlyRate*hoursWorked;
            }
            default -> {
                return baseSalary;
            }
        }
    }

    public void addProject(Project project) {
        if (projects == null) {
            projects = new ArrayList<>();
        }
        projects.add(project);
    }
    public void removeProject(int projectId) {
        if (projects != null) {
            projects.removeIf(project -> project.getId()== projectId);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", contractDuration=" + contractDuration +
                ", entryDate='" + entryDate + '\'' +
                ", noticePeriod=" + noticePeriod +
                ", employeeType=" + employeeType +
                ", projects=" + projects +
                '}';
    }
}
