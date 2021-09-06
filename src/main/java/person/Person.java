package person;

public class Person {
	private String name;
	private int age;
	private String petName;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
