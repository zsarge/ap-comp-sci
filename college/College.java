class College {
	private String name;
	private int yearFounded;

	public College() {
		this.name = "";
		this.yearFounded = 1;
	}

	public College(String name, int yearFounded) {
		this.name = name;
		this.yearFounded = yearFounded;
	}

	public String getName() {
		return name;
	}

	public int getYearFounded() {
		return yearFounded;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}
}

class TestCollege {
	public static void main(String args[]) {
		College college = new College("Ohio State University", 1870);
		college.setName("THE " + college.getName());
		System.out.println(college.getName());
	}
}

