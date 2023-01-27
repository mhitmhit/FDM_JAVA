package com.fdmgroup.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Employee;


public class EmployeeDAO implements IDao<Employee, Integer> {

	private EntityManagerFactory emf;
	public EmployeeDAO() {
		emf = Persistence.createEntityManagerFactory("jpaDemoPersistence");
	}
	
	@Override
	public void insert(Employee entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);  						// Persisted Object
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Employee select(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Employee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
