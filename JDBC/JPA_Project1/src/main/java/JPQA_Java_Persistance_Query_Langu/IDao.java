package JPQA_Java_Persistance_Query_Langu;

import java.util.List;

public interface IDao<E,K> {
	public void insert(E entity);
	public E select(K key);
	public void update(E entity);
	public void delete(K key);
	public List<E> selectAll();
	public String getNameOfPresidentByPresidentID(int id);
}
