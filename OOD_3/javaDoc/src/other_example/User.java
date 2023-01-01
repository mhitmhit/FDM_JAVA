package other_example;

/**
 * User represents a user of the Trading Platform. 
 * All users must have a username and password. 
 * 
 * @author shoshana.kesselman
 * @version 1.0
 */

public class User {
	private String username;
	private String password;

	/**
	 * Prints to the console. 
	 * 
	 * @param extra Additional text that will be displayed alongside the username and password.	 
	 */
	public void printUserDetails(String extra){
		System.out.println("Username: "+ username+" extra is: "+extra); 
		System.out.println("Password: "+ password+" extra is: "+extra);
	}
	
	/**
	 * Getter method for private instance variable userName
	 */
	public String getUsername(){
		return username;
	}
	
	/**
	 * Getter method for private instance variable password
	 */
	public String getPassword(){
		return password;
	}
	
	/**
	 * Setter method for private instance variable userName
	 */
	public void setUsername(String username){
		this.username = username;
	}
	
	/**
	 * Setter method for private instance variable password
	 */
	public void setPassword(String password){
		this.password = password;
	}
	
}
