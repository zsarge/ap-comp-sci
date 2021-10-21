class RecursiveStuff {
	public static void main(String[] args) {
		// System.out.println(triangle(3));
		// System.out.println(triangle(10));
		countDown(10);
		countDownRec(10);
	}
	private static void countDown(int n) {
		for (int i = 0; i <= n; i++)
			System.out.println(n - i);
	}
	public static int triangle(int n) {
		int output = 0;
		for (int i = 0; i <= n; i++)
			output += i;
		return output;
	}
	public static int triangleRec(int n) {
		if (n == 0)
			return 0;
		else 
			return triangleRec(n - 1) + n;
	}
	public static void countDownRec(int n) {
		System.out.println(n);
		if (n > 0)
			countDownRec(n - 1);
	}
}
