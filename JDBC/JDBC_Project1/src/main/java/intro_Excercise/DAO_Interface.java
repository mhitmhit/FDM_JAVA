package intro_Excercise;

import java.sql.SQLException;
import java.util.List;

public interface DAO_Interface {
	
	void addUser (User user);
	User getUser (String username) throws SQLException;
	void removeUser(String username);
	void updateUser (User user);
	List<User> listUsers() throws SQLException;

}
