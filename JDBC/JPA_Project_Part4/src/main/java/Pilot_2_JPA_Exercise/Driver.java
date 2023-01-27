package Pilot_2_JPA_Exercise;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDao<User, Integer> UserDAO = new User_JPA_DAO();
		IDao<Message, Integer> MessDAO = new Messages_JPA_DAO();
		
//		User user1 = new User(1, "user1", "user1Password", 101); // Transient Object
//		User user2 = new User(2, "user2", "user2Password", 102);
//		User user3 = new User(3, "user3", "user3Password", 103);
//		User user4 = new User(4, "user4", "user4Password", 104);
		User user1 = new User("user1", "user1 Password", 101); // Transient Object
		User user2 = new User("user2", "user2 Password", 102);
		User user3 = new User("user3", "user3 Password", 103);
		User user4 = new User("user4", "user4 Password", 104);
		
		
		UserDAO.insert(user1); 									// Persisted Object here, in sync with DB
		UserDAO.insert(user2);
		UserDAO.insert(user3);
		UserDAO.insert(user4);
		
		//User retUser = UserDAO.select(1);
		//System.out.println(retUser.getUsername());
		
		//UserDAO.delete(2);
		//user1.setPassword("test1passwrd");   					// Persisted Object, Updated
		//UserDAO.update(user1);
		System.out.println(
		"number of users in the database: " + UserDAO.selectAll().size()
		);
		
		Message mes1 = new Message("hello earth 1", user1, user2);
		
		Message mes2 = new Message("hello earth 2", user4, user3);
		Message mes3 = new Message("hello earth 3", user2, user1);
		Message mes4 = new Message("hello earth 3", user2, user1);
		
		MessDAO.insert(mes1);
		MessDAO.insert(mes2);
		MessDAO.insert(mes3);
		
		System.out.println(
				"testing select: "+
		MessDAO.select(6).getMessageContent()
		);
		
		mes2.setMessageContent("hello mars 2");
		MessDAO.update(mes2);
		
		System.out.println(
				"testing update, mes2 should say hell mars: "+
		MessDAO.select(6).getMessageContent()
		);
		
		
		
		
	}

}
