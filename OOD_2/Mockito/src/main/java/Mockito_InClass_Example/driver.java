package Mockito_InClass_Example;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDataBaseAccess userDataBaseAccess = new UserDataBaseAccess();
		
		UserManager userManager = new UserManager(userDataBaseAccess);
		
		boolean test = userManager.authenticate("usernamme", "password");
		
		System.out.println(test);
		System.out.println();
	}

}
