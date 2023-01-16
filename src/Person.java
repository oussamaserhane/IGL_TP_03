package Library_Managment;

public class Person {

	private String name;

	private String last_name;

	private int age;

	private String gender;

	public Person() {
	}

	public Person(String name, String last_name, int age, String gender) { // <----- To added
		this.name = name;
		this.last_name = last_name;
		this.age = age;
		this.gender = gender;
	}
}
