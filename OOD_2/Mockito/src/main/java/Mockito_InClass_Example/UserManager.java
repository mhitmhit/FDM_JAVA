package Mockito_InClass_Example;

public class UserManager {
	
	private UserDataBaseAccess mockUserDataBaseAccess;

	public UserManager(UserDataBaseAccess mockUserDatabaseAccess) {
		super();
		this.mockUserDataBaseAccess = mockUserDatabaseAccess;
	}

	public boolean authenticate(String userName, String password) {
		User returnedUser = mockUserDataBaseAccess.getUser(userName);
		System.out.println(returnedUser);
		if (returnedUser != null && password.equals(returnedUser.getPassword())) {
			return true;
		}
		return false;
	}
	
}
