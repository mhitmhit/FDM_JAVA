package chessPlayerExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class ChessplayerJDBCDao implements IDao<Chessplayer,Integer> {
	private static final String H2_URL = "jdbc:h2:~/Desktop/DataAccessDemo/jdbc1/demo1;AUTO_SERVER=TRUE";
	private static final String ORACLE_URL = "jdbc:oracle:thin:@20.58.25.15:1521:XE";
	private static final String ORACLE_LOCAL_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String username = "trainee1";
	private static final String password = "!QAZSE4";

	public ChessplayerJDBCDao() throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
	}
	
	@Override
	public void insert(Chessplayer entity) {
		// Try with resources allows us to create a connection and auto-close it afterwards
		try (Connection conn = DriverManager.getConnection(ORACLE_LOCAL_URL, username, password)) {
			/*Statement stmt = conn.createStatement();
			String insert = "INSERT INTO chessplayers VALUES(" + entity.getChessplayerid() +",'" + entity.getFirstname()
				+ "','" + entity.getLastname() + "'," + entity.getRating() + ")";
			stmt.executeUpdate(insert);*/
			
			String insert = "INSERT INTO chessplayers VALUES(?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(insert);
			stmt.setInt(1, entity.getChessplayerid());
			stmt.setString(2, entity.getFirstname());
			stmt.setString(3, entity.getLastname());
			stmt.setInt(4, entity.getRating());
			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
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
