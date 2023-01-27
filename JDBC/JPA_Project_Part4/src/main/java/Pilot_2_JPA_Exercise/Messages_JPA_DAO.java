package Pilot_2_JPA_Exercise;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Messages_JPA_DAO implements IDao<Message, Integer> {

	private EntityManagerFactory emf;
	public Messages_JPA_DAO() {
		emf = Persistence.createEntityManagerFactory("jpaDemoPersistence");
	}
	
	@Override
	public void insert(Message message) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(message);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Message select(Integer key) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		return em.find(Message.class, key);
	}

	@Override
	public void update(Message newMessage) {
		EntityManager em = emf.createEntityManager();
		Message message = em.find(Message.class, newMessage.getMessageId());
		em.getTransaction().begin();
		message.setMessageContent(newMessage.getMessageContent());
		message.setRecipient(newMessage.getRecipient());
		message.setSender(newMessage.getSender());
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Integer key) {
		EntityManager em = emf.createEntityManager();
		Message re = em.find(Message.class, key);
		em.getTransaction().begin();
		em.remove(re);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List<Message> selectAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT u FROM Message u", Message.class);
		List<Message> allUsers = query.getResultList();
		return allUsers;
	}

}
