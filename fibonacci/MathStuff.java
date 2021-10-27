class MathStuff {
	public static void main(String[] args) {
		// for (int i = 0; i < 10; i++)
			// System.out.println( tribonnaci(i) );
			System.out.println( (double) lucas(0, 0, 20) / lucas(0, 0, 19) );
		// for (int i = 0; i < 10; i++)
			// System.out.println( lucas(0, 0, i) );
	}
	public static int tribonnaci(int n) {
		int a, b, c, d;
		b = c = d = 0;
		a = 1;
		for (int i = 0; i < n; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		return d;
	}
	public static int lucas(int a, int b, int n) {
		int c;
		b = c = 0;
		a = 1;
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static int fibonnaci(int n) {
		int a, b, c;
		b = c = 0;
		a = 1;
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static int fibonnaci2(int n) {
		if (n <= 1)
			return n;
		return fibonnaci2(n - 1) + fibonnaci2(n - 2);
	}
}
