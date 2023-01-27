package com.fdmgroup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "parttime_employee")
public class PartTimeEmployee extends Employee {
	@Column(nullable = false)
	private double wages;

	public PartTimeEmployee() {
		super();
	}
	
	public PartTimeEmployee(int empId, String empName, String empDesignation, double wages) {
		super(empId, empName, empDesignation);
		this.wages = wages;
	}
	public PartTimeEmployee(String empName, String empDesignation, double wages) {
		super(empName, empDesignation);
		this.wages = wages;
	}
	
	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}

	
	
	
}
