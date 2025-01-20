package com.jbk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	   @Id
	    private int id;

	   @Column(name="name")
	    private String name;

	   @Column(name="department")
	    private String department;

	    public Employee() {}

	    public Employee(int id, String name, String department) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	    }

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	    }
	}

