package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fulltime_employee")
public class FullTimeEmployee extends Employee {
	@Column(nullable = false)
	private double salary;

	public FullTimeEmployee() {
		super();
	}
	
	public FullTimeEmployee(int empId, String empName, String empDesignation, double salary) {
		super(empId, empName, empDesignation);
		this.salary = salary;
	}
	
	public FullTimeEmployee(String empName, String empDesignation, double salary) {
		super(empName, empDesignation);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
