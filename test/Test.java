class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(makeI(i));
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
