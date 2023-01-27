package inClassExample;

import Chessplayer.Chessplayer;

public class DaoJPAClient {
	public static void main(String args[]) {
		IDao<Chessplayer,Integer> dao = new ChessplayerJPADao();
	
		Chessplayer cp1 = new Chessplayer(1,"Mikhail","Tal",2705);
		Chessplayer cp2 = new Chessplayer(2,"Viktor", "Korchnoi",2695);
		Chessplayer cp3 = new Chessplayer(3,"Anatoly","Karpov",2780);
		
		dao.insert(cp1);
		dao.insert(cp2);
		dao.insert(cp3);
	}
	
}
