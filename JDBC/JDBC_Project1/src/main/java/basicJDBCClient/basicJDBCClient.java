package basicJDBCClient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class basicJDBCClient {
	 private static final String H2_URL = "jdbc:h2:~/Desktop/DataAccessDemo/jdbc1/demo1;AUTO_SERVER=TRUE";
	 private static final String ORACLE_URL = "jdbc:oracle:thin:@20.58.25.15:1521:XE";
	 private static final String ORACLE_LOCAL_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	 private static final String username = "yassineelkabaili1";
	 private static final String password = "!QAZSE4";
	
	public static void main(String[] args) throws SQLException {
		// connection setup stuff
		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection(ORACLE_URL, username, password);
			
		// execute queries here	
			Statement stmt = conn.createStatement();
			//String chessPlayerCreateStatement = " CREATE TABLE chessplayers (chessplayer_id NUMBER(8) PRIMARY KEY, "
			//		+ "first_name VARCHAR2(16) NOT NULL, last_name VARCHAR2(16) NOT NULL, rating NUMBER(4) )";
			
			//stmt.execute(chessPlayerCreateStatement);
			
			String insertcp1 = "INSERT INTO chessplayers (chessplayer_id, first_name, last_name, rating) "
														+"VALUES (1, 'Robert', 'Fisher', 2895)";
			String insertcp2 = "INSERT INTO chessplayers VALUES (2, 'Garry', 'Kasparov', 2863)";
			String insertcp3 = "INSERT INTO chessplayers VALUES (3, 'Adolf', 'Anderson', NULL)";
			
			//stmt.executeUpdate(insertcp1);
			//stmt.executeUpdate(insertcp2);
			//stmt.executeUpdate(insertcp3);
			
			
			String selectcp = "SELECT * FROM chessplayers";
			ResultSet rs = stmt.executeQuery(selectcp);
			
			while (rs.next()) {
				String name = rs.getString(2) + " " + rs.getString("last_name");
				int rating = rs.getInt("rating");
				System.out.println(name + " " + rating);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		// connection closing stuff	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}// End of main

}// End of class
