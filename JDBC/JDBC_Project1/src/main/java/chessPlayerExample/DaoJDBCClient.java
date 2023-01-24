package chessPlayerExample;

import java.sql.SQLException;

public class DaoJDBCClient {
	public static void main(String args[]) throws SQLException {
		IDao<Chessplayer,Integer> dao = new ChessplayerJDBCDao();
		Chessplayer cp1 = new Chessplayer(4,"Jose Raul","Capablanca", 2866);
		dao.insert(cp1);
		
		//Chessplayer cpinjection = new Chessplayer(66,"Bobby","Tables",101);
		//cpinjection.setLastname("T',1); DROP TABLE chessplayers;--");
		//dao.insert(cpinjection);
		
	}
}
