package com.fdmgroup.Spring_core_demo.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T, ID> {
	public T save(T t);
	public Optional<T> findById(ID id);
	public List<T> findAll();
	public void deleteById(ID id);
	public boolean existsByID(ID id);
}
