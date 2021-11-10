class Complex {
	private double a, b;
	public Complex(double x, double y) {
		a = x;
		b = y;
	}
	public void setComplex(Complex other) {
		this.a = other.a;
		this.b = other.b;
	}
	public double getR() {
		return Math.sqrt(a*a  + b*b);
	}
	public void setRe(double re) {
		a = re;
	}
	public void setIm(double im)  {
		b = im;
	}
	public double re() {
		return a;
	}
	public double im() {
		return b;
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
			(this.a * other.b) + (this.a * other.b)
		);
	}
	public Complex scale(double n) {
		return new Complex(n * a, n * b);
	}
	public static boolean equals(double x, double y, double tol) {
		return Math.abs(x - y) <= tol;
	}
	public double getTheta() {
		double output = 0.0;
		if ( equals(a, 0.0, 0.000001) ) {
			if ( b > 0.0 ) {
				output = Math.PI / 2;
			} else {
				output = 3 * Math.PI / 2;
			}
		} else {
			if ( a > 0.0 ) {
				output = Math.atan(b/a);
			} else {
				output = Math.atan(b/a) + Math.PI;
			}
		}
		// return (int)(Math.round(1000 * output)) / 1000.0;
		return output;
	}
	public Complex dividedBy(Complex other) {
		if (equals(other.a, 0.0, 0) && equals(other.b, 0.0, 0)) {
			return new Complex(0, 0);
		} else {
			return this.times(other.conjugate()).scale(1.0 / (other.a*other.a + other.b*other.b));
		}
	}
	public Complex conjugate() {
		return new Complex(a, -b);
	}
	public static Complex complexFromPolar(double r, double theta) {
		double x = r*Math.cos(theta);
		double y = r*Math.sin(theta);
		return new Complex(x, y);
	}

	public static void main(String[] args) {
		Complex z1 = new Complex(1, 0);
		Complex z2 = new Complex(0, 1);

		// System.out.println(Complex.equals(3.0, 3.0, 0));
		// System.out.println(Complex.equals(1/3.0, 0.33333333333333333333333, 0.5));
		// System.out.println(Complex.equals(1/3.0, 0.33333333333333333333333, 0.0));
		System.out.println(z1.getTheta());
		System.out.println(z2.getTheta());
		System.out.println(z1.dividedBy(z2));

		// System.out.println(z1.plus(z2));
		// System.out.println(z1.minus(z2));
		// System.out.println(z1.times(z2));
		// System.out.println(z1.scale(5));
	}
}
