import java.util.*;

class Test {
	public static void main(String[] args) {
		String[] values = new String[] {"rock", "paper", "scissors", "lak"};
		for (String a : values) {
			for (String b : values) {
				System.out.print(rps(a, b));
				System.out.println("\t - " + a + "\t" + b + ":\t");
			}
		}
	}
	public static String rps(String p1, String p2) {
		// transform strings to ints
		Map<String, Integer> transform = new HashMap<String, Integer>();
		transform.put("rock", 0);
		transform.put("paper", 1);
		transform.put("scissors", 2);

		// return early if there was an invalid input.
		if (!transform.keySet().contains(p1))
			return "Player 1 Invalid Input";
		else if (!transform.keySet().contains(p2))
			return "Player 2 Invalid Input";

		int result = transform.get(p1) - transform.get(p2);

		switch (result) {
			case 0:
				return "tie";
			case 1:
			case -2:
				return "Player 1 wins";
			case -1:
			case 2:
				return "Player 2 wins";
			default: // satisfy the compiler
				return "";
		}
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
