package intro_Excercise;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO implements DAO_Interface{
	private static final String H2_URL = "jdbc:h2:~/Desktop/DataAccessDemo/jdbc1/demo1;AUTO_SERVER=TRUE";
	private static final String ORACLE_URL = "jdbc:oracle:thin:@20.58.25.15:1521:XE";
	private static final String ORACLE_LOCAL_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String username = "yassineelkabaili1";
	private static final String password = "!QAZSE4";
	 
	public UsersDAO() throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	}
	 
	public List<User> listUsers(){
		List<User> usersList = new ArrayList<User>();
		try(Connection conn = DriverManager.getConnection(ORACLE_URL, username, password)) {
			ResultSet rs = null;
			String query1 = "SELECT * FROM tpusers2";
			PreparedStatement stmt = conn.prepareStatement(query1);
			stmt.executeQuery();
			rs = stmt.executeQuery();
			User tempUser = null;
			while (rs.next()) {
				tempUser = new User();
				tempUser.setUserid(rs.getInt(1));
				tempUser.setUsername(rs.getString(2));
				tempUser.setPassword(rs.getString(3));
				tempUser.setFirstname(rs.getString(4));
				tempUser.setLastname(rs.getString(5));
				tempUser.setEmail(rs.getString(6));
				tempUser.setRole(rs.getString(7));
				tempUser.setStatus(rs.getInt(8));
				
				usersList.add(tempUser);
			}			
		}catch(SQLException e) {
			e.printStackTrace();
			}
		return usersList;
	}

	@Override
	public void addUser(User user) {
		try(Connection conn = DriverManager.getConnection(ORACLE_URL, this.username, password)) {
//			String query ="INSERT INTO tpusers2 VALUES(?,?,?,?,?,?,?,?)";
//			PreparedStatement stmt = conn.prepareStatement(query);
//			
//			stmt.setInt(1, user.getUserid());
//			stmt.setString(2, user.getUsername());
//			stmt.setString(3, user.getPassword());
//			stmt.setString(4, user.getFirstname());
//			stmt.setString(5, user.getLastname());
//			stmt.setString(6, user.getEmail());
//			stmt.setString(7, user.getRole());
//			stmt.setInt(8, user.getStatus());
//			
//			stmt.executeUpdate();

			
			String query = "{call add_user_to_tpusers2(?,?,?,?,?,?,?,?) }";
			CallableStatement stmt = conn.prepareCall(query);
			stmt.setInt(1, user.getUserid());
			stmt.setString(2, user.getUsername());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getFirstname());
			stmt.setString(5, user.getLastname());
			stmt.setString(6, user.getEmail());
			stmt.setString(7, user.getRole());
			stmt.setInt(8, user.getStatus());
			
			stmt.executeUpdate();
		
			
		}catch(SQLException e) {
			e.printStackTrace();
			}
	}

	@Override
	public User getUser(String username) throws SQLException {
		User tempUser = null;
		try(Connection conn = DriverManager.getConnection(ORACLE_URL, this.username, password)) {
			ResultSet rs = null;
			String query ="SELECT * FROM tpusers2 WHERE username = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, username);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				tempUser = new User();
				tempUser.setUserid(rs.getInt(1));
				tempUser.setUsername(rs.getString(2));
				tempUser.setPassword(rs.getString(3));
				tempUser.setFirstname(rs.getString(4));
				tempUser.setLastname(rs.getString(5));
				tempUser.setEmail(rs.getString(6));
				tempUser.setRole(rs.getString(7));
				tempUser.setStatus(rs.getInt(8));
			}

		}catch(SQLException e) {
			e.printStackTrace();
			}

		return tempUser;
	}

	@Override
	public void removeUser(String username) {
		try(Connection conn = DriverManager.getConnection(ORACLE_URL, this.username, password)) {
			String query ="DELETE FROM tpusers2 WHERE username = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, username);
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			}
		
	}

	@Override
	public void updateUser(User user) {
		try(Connection conn = DriverManager.getConnection(ORACLE_URL, this.username, password)) {
			ResultSet rs = null;
			String query ="SELECT username FROM tpusers2 WHERE userid = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, user.getUserid());
			rs = stmt.executeQuery();
			String username =null;
			while(rs.next()) {
				username = rs.getString(1);
			}
			
			removeUser(username);
			addUser(user);
			
			
//			String query ="INSERT INTO tpusers2 VALUES(?,?,?,?,?,?,?,?)";
//			PreparedStatement stmt = conn.prepareStatement(query);
//			
//			stmt.setInt(1, user.getUserid());
//			stmt.setString(2, user.getUsername());
//			stmt.setString(3, user.getPassword());
//			stmt.setString(4, user.getFirstname());
//			stmt.setString(5, user.getLastname());
//			stmt.setString(6, user.getEmail());
//			stmt.setString(7, user.getRole());
//			stmt.setInt(8, user.getStatus());
//			
//			stmt.executeUpdate();

			
//			String query = "{call add_user_to_tpusers2(?,?,?,?,?,?,?,?) }";
//			CallableStatement stmt = conn.prepareCall(query);
//			stmt.setInt(1, user.getUserid());
//			stmt.setString(2, user.getUsername());
//			stmt.setString(3, user.getPassword());
//			stmt.setString(4, user.getFirstname());
//			stmt.setString(5, user.getLastname());
//			stmt.setString(6, user.getEmail());
//			stmt.setString(7, user.getRole());
//			stmt.setInt(8, user.getStatus());
//			
//			stmt.executeUpdate();
		
			
		}catch(SQLException e) {
			e.printStackTrace();
			}
	}
}
