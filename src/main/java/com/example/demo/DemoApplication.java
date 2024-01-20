package com.example.demo;

import com.example.demo.enums.EmployeeType;
import com.example.demo.model.Employee;
import com.example.demo.model.Project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Project project1 = new Project(1, "CS", "Computer Science");
		Project project2 = new Project(2, "IS", "Information System");
		Project project3 = new Project(3, "MS", "Management System");

		Employee manager = new Employee(1,"Sondos", 23,12,"12-10-2022",1, EmployeeType.MANAGER);
		manager.addProject(project3);

		Employee engineer = new Employee(2,"May",20,12,"20-10-2023",12,EmployeeType.ENGINEER);
		engineer.addProject(project1);
		engineer.addProject(project2);

		System.out.println("manager details : ");
		System.out.println(manager);
		System.out.println("---------------------------------");
		System.out.println("engineer details : ");
		System.out.println(engineer);
	}

}
