package app;

import person.Person;
import util.Utils;

public class App {
	public static void main(String[] args) {
		Person person = new Person("Zhenya", 36);
		Utils.printUpperCase("Zhenay's age is " + person.getAge());
	}
}
