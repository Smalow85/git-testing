package app;

import person.Person;
import util.Utils;

public class App {
	public static void main(String[] args) {
		Person person = new Person("Zhenya", 18);
		Utils.printUpperCase("Person's age is " + person.getAge());
	}
}
