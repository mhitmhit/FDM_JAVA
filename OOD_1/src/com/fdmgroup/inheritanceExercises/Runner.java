package com.fdmgroup.inheritanceExercises;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminUser admin1 = new AdminUser("aliUsername", "aliPassword", "ali benarab");
		AdminUser admin2 = new AdminUser("tomUsername", "tomPassword", "tom balentio");
		
		Customer customer1 = new Customer("aliCustomerUsername", "aliCustomerPassword", "test customer 1");
		Customer customer2 = new Customer("tomCustomerUsername", "tomCustomerPassword", "test customer 2");
		
		System.out.println(
			admin1.getFullName()
		);	
		System.out.println(
			admin1.getUsername()
		);
		System.out.println(
			admin1.getPassword()
		);
		System.out.println(
		admin1.changePassword("test", "test")
		);
		System.out.println(
				admin1.getPassword()
		);
		admin1.accessWebsite();
		customer1.accessWebsite();
		
		System.out.println("----------part 3 testing-----");
		UserAccountManager manager1 = new UserAccountManager();
		manager1.addUser(admin1);
		manager1.addUser(admin2);
		manager1.addUser(customer1);
		manager1.addUser(customer2);
		
		System.out.println(
				manager1.login("test", "test")
		);
		System.out.println(
				manager1.login("tomUsername", "tomPassword")
		);
	}

}
