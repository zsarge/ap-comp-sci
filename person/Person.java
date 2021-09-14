import java.util.*;

/*
 * use:
 * `javac Person.java && java Runner`
 */

class Person {
	private int age;
	private String name;
	private boolean alive;

	public Person() {
		age = 0;
		name = "Baby Doe";
		alive = true;
	}

	public Person(String name, int age, boolean alive) {
		this.age = age;
		this.name = name;
		this.alive = alive;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public boolean isAlive() {
		return alive;
	}

	public String toString() {
		return "All about \"" + name + "\":" +
			(alive 
			 ? "\n\tI am " + age + " years old." 
			 : "\n\tI am dead.");
	}

	public void printAboutMe() {
		System.out.println("All about " + getName() + ":");
		if (alive)
			System.out.println("\tI am " + getAge() + " years old.");
		else 
			System.out.println("\tI am dead");
	}
}

class Runner {
	public static void main(String args[]) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person()); 
		people.add(new Person("Zack Sargent", 17, true));
		people.add(new Person("Thomas Jefferson", 278, true));

		for (Person person : people)
			System.out.println(person);
	}
}
