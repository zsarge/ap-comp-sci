class Person {
	private String name;
	private int age;

	public Person() {
		name = "John Doe";
		age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " is " + age + " years old.";
	}
}

class Objects {
	public static void main(String[] args) {
		Person robert1 = new Person("Robert Noyce", 56);
		Person robert2 = new Person("Robert Noyce", 56);

		System.out.println(robert1);
		System.out.println(robert2);
		System.out.println(robert1 == robert2);

		robert1 = robert2;
		System.out.println(robert1 == robert2);

		robert1 = new Person("alskdj", 56);
		System.out.println(robert1);
		System.out.println(robert2);
		System.out.println(robert1 == robert2);
	}
}
