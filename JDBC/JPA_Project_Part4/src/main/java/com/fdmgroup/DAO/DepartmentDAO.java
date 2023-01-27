package com.fdmgroup.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Department;

public class DepartmentDAO implements IDao<Department, Integer> {

	private EntityManagerFactory emf;
	public DepartmentDAO() {
		emf = Persistence.createEntityManagerFactory("jpaDemoPersistence");
	}
	
	@Override
	public void insert(Department entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);  						// Persisted Object
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Department select(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Department entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Department> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
