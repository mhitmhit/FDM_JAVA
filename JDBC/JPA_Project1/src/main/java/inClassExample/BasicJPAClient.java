package inClassExample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Chessplayer.Chessplayer;

public class BasicJPAClient {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaDemoPersistence");
		EntityManager em = emf.createEntityManager();
		
		Chessplayer cp1 = new Chessplayer(1,"Mikhail","Tal",2705);
		Chessplayer cp2 = new Chessplayer(2,"Viktor", "Korchnoi",2695);
		Chessplayer cp3 = new Chessplayer(3,"Robert","Fischer",2895);
		Chessplayer cp4 = new Chessplayer(4,"Anatoly","Karpov",2780);
		Chessplayer cp5 = new Chessplayer(5,"Garry","Kasparov",2863);
		
		em.getTransaction().begin();
		em.persist(cp1);
		em.persist(cp2);
		em.persist(cp3);
		em.persist(cp4);
		em.persist(cp5);

		em.getTransaction().commit();

		Chessplayer mycp = em.find(Chessplayer.class, 3);
		Chessplayer korchnoi = em.find(Chessplayer.class, 2);
		System.out.println("Chessplayer ID 3 is: " + mycp.getFirstname() + " " + mycp.getLastname() );
		
		em.getTransaction().begin();
		em.remove(korchnoi);
		mycp.setFirstname("Bobby");		
		em.getTransaction().commit();

		Query query = em.createQuery("SELECT c FROM Chessplayer c WHERE rating >= 2800",Chessplayer.class);
		List<Chessplayer> cplist = query.getResultList();
		
		for (int loop = 0; loop < cplist.size();loop++) {
			String name = cplist.get(loop).getFirstname() + " " + cplist.get(loop).getLastname();
			int rating = cplist.get(loop).getRating();
			System.out.println("Chessplayer " + name + " has a rating of " + rating);
		}
		
		em.close();
	}
}
