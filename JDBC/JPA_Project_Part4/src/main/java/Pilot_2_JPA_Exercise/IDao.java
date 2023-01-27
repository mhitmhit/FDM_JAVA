package Pilot_2_JPA_Exercise;

import java.util.List;

public interface IDao<E,K> {
	public void insert(E entity);
	public E select(K key);
	public void update(E entity);
	public void delete(K key);
	public List<E> selectAll();
}
