package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {
	@Id
	@Column(name = "DEPT_ID")
	@SequenceGenerator(name= "Department_ID")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="Department_ID")
	private int deptId;
	@Column(name = "dept_name", nullable = false, unique=true)
	private String deptName;
	
	
//	@OneToMany(mappedBy = "dept")
//	private List<Employee> employees;
//	
//	
	public Department() {
		super();
	}
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
}
