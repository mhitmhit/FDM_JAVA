package com.fdmgroup.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.fdmgroup.model.Department;
import com.fdmgroup.model.Employee;
import com.fdmgroup.model.FullTimeEmployee;
import com.fdmgroup.model.PartTimeEmployee;


public class driver {

	public static void main(String[] args) {
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("jpaDemoPersistence");
		EntityManager em = emf.createEntityManager();
		
		// employees
		Employee emp1 = new FullTimeEmployee("john Doe", "trainee", 100000);
		Employee emp2 = new FullTimeEmployee("jane doe", "executive", 120000);
		Employee emp3 = new PartTimeEmployee("james smith", "trainer", 80);
		
		// departments
		Department dep1 = new Department("Academy");
		Department dep2 = new Department("Sales");
		
		// setting employee.department
		emp1.setDept(dep1);
		emp2.setDept(dep2);
		emp3.setDept(dep1);
		dep1.addEmployee(emp1);
		dep1.addEmployee(emp3);
		dep2.addEmployee(emp2);
		
		// persisting departments and employees
		em.getTransaction().begin();
			em.persist(dep1); 
			em.persist(dep2);
			em.persist(emp1); 
			em.persist(emp2);
			em.persist(emp3);
		em.getTransaction().commit();
		
		
		// query to get department by Name
		String dept = "Academy";
		List<Department> departments = em.createNamedQuery("findByDeptName").setParameter(1, dept).getResultList();
		// print out of all employees in the queried departmtent
		System.out.println("List of employees in the "+dept+" department");
		for (Employee e:departments.get(0).getEmployeeList()){
			System.out.println("employee id: "+e.getEmpId()+" employee name: "+e.getEmpName());
		}
		
		
		
		
		
		em.close();	

	}// end of main

}
