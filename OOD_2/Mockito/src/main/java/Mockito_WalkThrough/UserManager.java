package Mockito_WalkThrough;

public class UserManager {

	private UserDatabaseAccess userDatabaseAccess;

	public UserManager(UserDatabaseAccess mockUserDatabaseAccess) {
		this.userDatabaseAccess = mockUserDatabaseAccess;
	}

	public boolean authenticate(String username, String password) {
		User user = userDatabaseAccess.getUser(username);
		return false;
	}

}
