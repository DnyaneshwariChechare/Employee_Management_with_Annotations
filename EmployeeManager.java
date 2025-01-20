package com.jbk;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
	 private List<Employee> employees = new ArrayList<>();

	    public void addEmployee(Employee employee) {
	        employees.add(employee);
	        System.out.println("Employee added: " + employee);
	    }

	    public void removeEmployee(int id) {
	        employees.removeIf(emp -> emp.getId() == id);
	        System.out.println("Employee with ID " + id + " removed.");
	    }

	    public void listEmployees() {
	        System.out.println("Employee List:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }
	}

