package pl.iwiwiwi.spring.test;

public class PersonFactory {

	public Person createPerson(int id, String name) {
		System.out.println("Using PersonFactory to create Person");
		return new Person(id, name);
	}
}
