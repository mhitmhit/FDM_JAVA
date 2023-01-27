package JPQA_Java_Persistance_Query_Langu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class President_JPA_DAO implements IDao<President, Integer> {

	private EntityManagerFactory emf;
	public President_JPA_DAO() {
		emf = Persistence.createEntityManagerFactory("jpaDemoPersistence");
	}
	
	@Override
	public void insert(President entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);  						// Persisted Object
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public President select(Integer key) {
		EntityManager em = emf.createEntityManager();
		President retPresident = em.find(President.class, key);
		return retPresident;
	}

	@Override
	public void update(President entity) {
		EntityManager em = emf.createEntityManager();
		President retPresident = em.find(President.class, entity.getPresidentid()); // Persisted Object
		em.getTransaction().begin();							
		retPresident.setName(entity.getName());				// updates object in both
		retPresident.setStatus(entity.getStatus());				// DB and java Context
		retPresident.setStatus(entity.getStatus());
		em.getTransaction().commit();
	}

	@Override
	public void delete(Integer key) {
		EntityManager em = emf.createEntityManager();
		President retPresident = em.find(President.class, key);
		em.getTransaction().begin();
		em.remove(retPresident);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<President> selectAll() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT u FROM President u", President.class);
		List<President> allPresidents = query.getResultList();
		return allPresidents;
	}

	@Override
	public String getNameOfPresidentByPresidentID(int id) {
		EntityManager em = emf.createEntityManager();
		//Query query = em.createQuery("SELECT p FROM President p WHERE p.presidentid = ?1", President.class);
		//query.setParameter(1, id);
		Query query = em.createNamedQuery("findPresidentByID");												// usng createNamedQuery
		query.setParameter(1, id);
		
		List<President> matchedPres = query.getResultList();
		return matchedPres.get(0).getName();
	}


}
