package com.jbk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // Get the EmployeeManager bean
        EmployeeManager employeeManager = context.getBean(EmployeeManager.class);

        // Add employees
        employeeManager.addEmployee(new Employee(1, "Siya", "HR"));
        employeeManager.addEmployee(new Employee(2, "Jiya", "Finance"));
        employeeManager.addEmployee(new Employee(3, "Riya", "Engineering"));

        // List employees
        employeeManager.listEmployees();

        // Remove an employee
        employeeManager.removeEmployee(2);

        // List employees again
        employeeManager.listEmployees();

        ((AnnotationConfigApplicationContext) context).close();
    }
}

