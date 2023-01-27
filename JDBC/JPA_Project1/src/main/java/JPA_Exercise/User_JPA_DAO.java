package JPA_Exercise;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class User_JPA_DAO implements IDao<User, Integer> {

	private EntityManagerFactory emf;
	public User_JPA_DAO() {
		emf = Persistence.createEntityManagerFactory("jpaDemoPersistence");
	}
	
	@Override
	public void insert(User entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);  						// Persisted Object
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public User select(Integer key) {
		EntityManager em = emf.createEntityManager();
		User retUser = em.find(User.class, key);
		return retUser;
	}

	@Override
	public void update(User entity) {
		EntityManager em = emf.createEntityManager();
		User retUser = em.find(User.class, entity.getUserid()); // Persisted Object
		em.getTransaction().begin();							
		retUser.setUsername(entity.getUsername());				// updates object in both
		retUser.setPassword(entity.getPassword());				// DB and java Context
		retUser.setStatus(entity.getStatus());
		em.getTransaction().commit();
	}

	@Override
	public void delete(Integer key) {
		EntityManager em = emf.createEntityManager();
		User retUser = em.find(User.class, key);
		em.getTransaction().begin();
		em.remove(retUser);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT u FROM User u", User.class);
		List<User> allUsers = query.getResultList();
		return allUsers;
	}


}
