class Person {
	private String name;
	private int age;
	private boolean living;

	public Person() {
		this.name = "A. Person";
		this.age = 0;
		this.living = true;
	}

	public Person(String name, int age, boolean living) {
		this.name   = name;
		this.age    = age;
		this.living = living;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean getLiving() {
		return living;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLiving(boolean living) {
		this.living = living;
	}

	@Override
	public String toString() {
		return name + " is " + age + " years old and " + (living ? "is alive" : "is dead");
	}

	public static void main(String[] args) {
		Person lin = new Person("Lin manuel miranda", 37, true);
		System.out.println(lin);
	}
}
