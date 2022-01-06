class Student extends Person {
	private double gpa;

	public Student() {
		gpa = 4.0;
	}

	public Student(String name, int age, boolean living, double gpa) {
		super(name, age, living);
		this.gpa = gpa;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return getName() + " is " + getAge() + " years old and " + (getLiving() ? "is alive" : "is dead") + " and has a gpa of " + gpa;
	}
}
