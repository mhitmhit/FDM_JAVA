package Mockito_InClass_Example;

import java.util.List;

public class UserAdmin {
	
	private UserDataBaseAccess userDataBaseAccess;

	public UserAdmin(UserDataBaseAccess mockUserDataBaseAccess) {
		this.userDataBaseAccess = mockUserDataBaseAccess;
	}

	public void createMultipleUsers(List<String> usernames, String password) {
		for (String eachUsername : usernames) {
			User user = new User(eachUsername, password);
			userDataBaseAccess.addUser(user);
		}
	}

}
