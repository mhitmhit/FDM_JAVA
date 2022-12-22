package InClass;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public int getAge() {
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
