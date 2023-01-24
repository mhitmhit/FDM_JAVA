package basicJDBCClient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class basicJDBCClientWorking {
	 private static final String H2_URL = "jdbc:h2:~/Desktop/DataAccessDemo/jdbc1/demo1;AUTO_SERVER=TRUE";
	 private static final String ORACLE_URL = "jdbc:oracle:thin:@20.58.25.15:1521:XE";
	 private static final String ORACLE_LOCAL_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	 private static final String username = "yassineelkabaili1";
	 private static final String password = "!QAZSE4";
	
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection(ORACLE_URL, username, password);
			System.out.println("connection established");
		}catch(SQLException e) {
			System.out.println("failed to establish connection");
			e.printStackTrace();
		}finally {
			System.out.println("in finally block....checking on the connection");
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
					System.out.println("connection closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}// End of main

}// End of class
