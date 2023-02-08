package com.fdmgroup.springcoredemo.repository;

import java.util.List;
import java.util.Optional;

public interface Repository_DELETE<T, ID> {
	public T save(T t);
	public Optional<T> findById(ID id);
	public List<T> findAll();
	public void deleteById(ID id);
	public boolean existsByID(ID id);
}
