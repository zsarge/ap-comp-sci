class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(nthPrime(i));
	}
	public static int nthPrime(int n) {
		int count = 0;
		int num = 2;
		while (count < n) {
			num++;
			if (isPrimeOptimized(num))
				count++;
		}
		return num;
	}
	public static boolean isPrimeOptimized(int n) {
		if (n % 2 == 0 && n != 2 && n != 0)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
			// if (n % (i * i) == 0)
				// return false;
		}
		return true;
	}
	public static String makeI(int n) {
		if (n <= 0)
			return "";
		else if (n == 1)
			return "I\n";

		int width = (2 * (n - 1)) + 1;

		char[][] tile = new char[width][width];

		// fill with spaces
		for (int i = 0; i < width; i++)
			for (int j = 0; j < width; j++)
				tile[j][i] = ' ';

		// top
		for (int i = 0; i < width; i++)
			tile[0][i] = 'I';

		// bottom
		for (int i = 0; i < width; i++)
			tile[width - 1][i] = 'I';

		// middle
		for (int i = 1; i < width - 1; i++)
			tile[i][width / 2] = 'I';

		// join 
		StringBuilder sb = new StringBuilder();
		for (char[] row : tile) {
			for (char c : row)
				sb.append(c);
			sb.append("\n");
		}

		return sb.toString();
	}
}
