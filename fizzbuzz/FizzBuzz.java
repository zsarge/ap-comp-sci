import java.util.*;
import java.util.stream.Collectors;

class FizzBuzz {
	// pretty standard fizzBuzz
	private static String fizzBuzz(int number) {
		StringBuilder sb = new StringBuilder();

		if (number % 3 == 0) sb.append("Fizz");
		if (number % 5 == 0) sb.append("Buzz");

		if (sb.length() == 0)
			return String.valueOf(number);
		else
			return sb.toString();
	}

	// Fizzbuzz using a hashmap to represent rules.
	private static String fizzBuzz2(int number) {
		Map<Integer, String> rules = new HashMap<Integer, String>();

		rules.put(3, "Fizz");
		rules.put(5, "Buzz");

		StringBuilder result = new StringBuilder();
		rules.forEach(
			(key, value) -> {
				if (number % key == 0)
					result.append(value);
			}
		);

		if (result.length() == 0)
			return String.valueOf(number);
		else
			return result.toString();
	}

	// even standard-er fizzbuzz
	private static String fizzBuzz3(int number) {
		if (number % 5 == 0 && number % 3 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else {
			return Integer.toString(number);
		}
	}

	public static void main(String[] args) {
		System.out.println("Method 1:");
		final int limit = 20;

		// this code is beautiful if you don't look at it.
		for (int i = 1; i < limit; i++)
			System.out.print(fizzBuzz(i) + (i < limit - 1 ? ", " : ""));

		System.out.println("\n");
		System.out.println("Method 2:");
		for (int i = 1; i < limit; i++)
			System.out.print(fizzBuzz(i) + (i < limit - 1 ? ", " : ""));

		System.out.println();
	}
}

