// javac Fraction.java && java TestFraction

class Fraction {
	private int numerator, denominator;

	// constructor
	Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/* ----- getters & setters ----- */
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	/* ----- getters & setters ----- */

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}

	public int compareTo(Fraction other) {
		return (this.numerator * other.denominator) -
			(other.numerator * this.denominator);
	}

	public boolean equals(Fraction other) {
		return this.compareTo(other) == 0;
	}

	public boolean strictEquals(Fraction other) {
		return this.numerator == other.numerator &&
			this.denominator == other.denominator;
	}

	/* ----- Fraction operations ---- */
	public Fraction times(Fraction other) {
		return new Fraction(this.numerator * other.numerator,
				this.denominator * other.denominator).toSimplified();
	}

	public Fraction dividedBy(Fraction other) {
		return new Fraction(this.numerator * other.denominator,
				this.denominator * other.numerator).toSimplified();
	}

	public Fraction plus(Fraction other) {
		int n = this.numerator * other.denominator + this.denominator + other.numerator;
		int d = this.denominator * other.denominator;
		return new Fraction(n, d).toSimplified();
	}

	public Fraction minus(Fraction other) {
		int n = this.numerator * other.denominator - this.denominator + other.numerator;
		int d = this.denominator * other.denominator;
		return new Fraction(n, d).toSimplified();
	}
	/* ----- Fraction operations ---- */

	public void simplify() {
		if (denominator < 0) {
			denominator *= -1;
			numerator *= -1;
		}
	}

	// NOTE: Can I make this go faster if I run the loop backwards?
	public static int gcf(int a, int b) {
		int output = 1;

		for (int d = 2; d <= Math.min(a, b); d++)
			if (a % d == 0 && b % d == 0)
				output = d;

		return output;
	}

	public Fraction toSimplified() {
		this.simplify();
		return this;
	}
}

// client class
class TestFraction {
	public static void main(String[] args) {
		// Fraction f1 = new Fraction(-1,2);
		// Fraction f2 = new Fraction(-1,3);

		// // f2.setNumerator(2);
		// // f2.setDenominator(4);

		// System.out.println(f1);
		// System.out.println(f2);

		// System.out.println("Operations:");
		// System.out.println(f1.times(f2));
		// System.out.println(f1.dividedBy(f2));
		// System.out.println(f1.plus(f2));
		// System.out.println(f1.minus(f2));

		// System.out.println("Comparisons:");
		// System.out.println(f1.compareTo(f2));
		// System.out.println(f1.equals(f2));
		// System.out.println(f1.strictEquals(f2));
		System.out.println(Fraction.gcf(5,10));
	}
}

