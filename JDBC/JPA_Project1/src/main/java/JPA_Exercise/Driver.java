package JPA_Exercise;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDao<User, Integer> UserDAO = new User_JPA_DAO();
		
		User user1 = new User(1, "user1", "user1Password", 101); // Transient Object
		User user2 = new User(2, "user2", "user2Password", 102);
		User user3 = new User(3, "user3", "user3Password", 103);
		User user4 = new User(4, "user4", "user4Password", 104);
		
		UserDAO.insert(user1); 									// Persisted Object here, in sync with DB
		UserDAO.insert(user2);
		UserDAO.insert(user3);
		UserDAO.insert(user4);
		
		User retUser = UserDAO.select(1);
		System.out.println(retUser.getUsername());
		
		//UserDAO.delete(2);
		//user1.setPassword("test1passwrd");   					// Persisted Object, Updated
		//UserDAO.update(user1);
		System.out.println(
		UserDAO.selectAll().size()
		);
	}

}
