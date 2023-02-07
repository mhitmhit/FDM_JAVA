package com.fdmgroup.spring_core_exercise1.interfaces;

import java.util.List;

public interface Repository<T, ID> {
	
	public T save(T t);
	public T findById(ID id);
	public List<T> findAll();
	public boolean existsById(ID id);
	public void deleteById(ID id);
	
	
}
