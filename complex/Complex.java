class Complex {
	private double a, b;
	public Complex(double x, double y) {
		a = x;
		b = y;
	}
	public String toString() {
		return a + " + " + b + "i";
	}
	public Complex plus(Complex other) {
		return new Complex(a + other.a, b + other.b);
	}
	public Complex minus(Complex other) {
		return new Complex(a - other.a, b - other.b);
	}
	public Complex times(Complex other) {
		return new Complex(
			(this.a * other.a) - (this.b * other.b),
			(this.a * other.a) + (this.b * other.b)
		);
	}
	public Complex scale(double n) {
		return new Complex(n * a, n * b);
	}
	public static void main(String[] args) {
		Complex z1 = new Complex(0, 2);
		Complex z2 = new Complex(0, 1);
		System.out.println(z1.plus(z2));
		System.out.println(z1.minus(z2));
		System.out.println(z1.times(z2));
		System.out.println(z1.scale(5));
	}
}
