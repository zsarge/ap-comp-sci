import java.util.*; 
import java.util.stream.Collectors;

class FizzBuzz {
	private static String fizzBuzz(int number) {
		StringBuilder sb = new StringBuilder();
		
		if (number % 3 == 0) sb.append("Fizz");
		if (number % 5 == 0) sb.append("Buzz");

		if (sb.length() == 0) 
			return String.valueOf(number);
		else 
			return sb.toString();
	}

	private static String fizzBuzz2(int number) {
		HashMap<Integer, String> rules = new HashMap<Integer, String>();

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

	public static void main(String[] args) {
		// System.out.println("Method 1:");
		// for (int i = 1; i < 20; i++)
			// System.out.println(fizzBuzz(i));

		System.out.println("Method 2:");
		for (int i = 1; i < 20; i++)
			System.out.println(fizzBuzz2(i));
	}
}

