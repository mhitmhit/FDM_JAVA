package inClassExample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Chessplayer.Chessplayer;

public class ChessplayerJPADao implements IDao<Chessplayer,Integer> {

	private EntityManagerFactory emf;
	public ChessplayerJPADao() {
		emf = Persistence.createEntityManagerFactory("jpaDemoPersistence");
	}
	
	@Override
	public void insert(Chessplayer entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Chessplayer select(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Chessplayer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Chessplayer> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
