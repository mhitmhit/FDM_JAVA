package intro_Excercise;

import java.sql.SQLException;
import java.util.List;

public class Users_Client {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DAO_Interface dao = new UsersDAO();
		
		//List<User> returnedList = dao.listUsers();
		
		//System.out.println(returnedList.size());
		
		//User retUser = dao.getUser("testUsername2");
		//System.out.println(retUser.getEmail());
		
		//dao.removeUser("testUsername2");
		
		//User user1 = new User(22222, "testUsername2","testPassword2", "testfirstName2", "testLastName2"
		//		, "testEmail2", "testRole2", 98);
		//User user2 = new User(55555, "testUsername5","testPassword5", "testfirstName5", "testLastName5"
		//		, "testEmail5", "testRole5", 99999);
		
		//dao.updateUser(user2);
		
		User retUser = dao.getUser("testUsername");
		
		retUser.setUsername("testUsername8");
		retUser.setPassword("testPassword8");
		retUser.setFirstname("testFirstName8");
		retUser.setLastname("testLastName8");
		retUser.setEmail("testEmail8");
		retUser.setRole("testrole8");
				
		dao.updateUser(retUser);
		
	}

}
