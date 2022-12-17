package Mockito_InClass_Example;

public class User {

	private String userName;
	private String password;

	public User(String username, String password2) {
		this.userName = username;
		this.password = password2;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}

	
}
