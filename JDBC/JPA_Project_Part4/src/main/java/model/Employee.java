package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee {
	@Id
	@SequenceGenerator(name= "Employee_ID")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="Employee_ID")
	@Column (name = "emp_id")
	private int empId;
	@Column(name="emp_name", updatable=false, nullable = false)
	private String empName;
	@Column(name="emp_designation", nullable = false)
	private String empDesignation;
	
	
	@ManyToOne
	@JoinColumn(name = "FK_DEPT_ID")
	private Department dept;
	
	
	public Employee(int empId, String empName, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	public Employee(String empName, String empDesignation) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
}
