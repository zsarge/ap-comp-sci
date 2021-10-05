import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/*
 * run with:
 * `javac RPS.java && java RPS`
 */
class RPS /* Rock Paper Scissors */ {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		testEverything();

		System.out.println("Your turn:");
		System.out.print("Enter your choice (rock, paper, or scissors): ");
		String userChoice = input.nextLine().toLowerCase();
		String computerChoice = getRandomChoice();

		System.out.println("Player 1 (you) chose " + userChoice);
		System.out.println("Player 2 (computer) chose " + computerChoice);

		System.out.println("Result: " + whoWon(userChoice, computerChoice));
	}

	public static String getRandomChoice() {
		int rand = randInt(1,3);

		switch (rand) {
			case 1:
				return "rock";
			case 2:
				return "paper";
			default:
				return "scissors";
		}
	}

	public static void testEverything() {
		String[] values = {
			"rock",
			"paper",
			"scissors",
		};

		System.out.println("Testing:");

		for (String value : values) {
			for (String value2 : values) {
				System.out.print("Player 1: " +  String.format("%-" + 10 + "s", value));
				System.out.print("Player 2: " + String.format("%-" + 10 + "s", value2));
				System.out.print("= ");
				System.out.println(whoWon(value, value2));
			}
		}
	}
	/*
	 * PRE-CONDITION: p1, p2 - "rock", "paper", or "scissors"
	 */
	public static String whoWon(String p1, String p2) {
		// transform strings to ints
		Map<String, Integer> transform = new HashMap<String, Integer>();
		transform.put("rock", 0);
		transform.put("paper", 1);
		transform.put("scissors", 2);

		// return early if there was an invalid input.
		if (!transform.keySet().contains(p1) || !transform.keySet().contains(p2)) {
			return "I'm afraid I can't help you";
		}

		int result = transform.get(p1) - transform.get(p2);

		switch (result) {
			case 0:
				return "It's a tie";
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

	public static int randInt(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1)) + min;
	}
}
