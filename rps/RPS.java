import static java.lang.System.out;
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

		out.print("Enter your choice (rock, paper, or scissors): ");
		String userChoice = input.nextLine().toLowerCase();
		String computerChoice = "";

		int rand = randInt(1,3);

		switch (rand) {
			case 1:
				computerChoice = "rock";
				break;
			case 2:
				computerChoice = "paper";
				break;
			default:
				computerChoice = "scissors";
		}

		out.println("You chose " + userChoice);
		out.println("Computer chose " + computerChoice);

		out.println("Result: " + whoWon(userChoice, computerChoice));
	}

	public static void testEverything() {
		String[] values = {
			"rock",
			"paper",
			"scissors",
		};

		out.println("Testing:");

		for (String value : values) {
			for (String value2 : values) {
				String result = whoWon(value, value2);
				out.print("Player 1: " +  String.format("%-" + 10 + "s", value));
				out.print("Player 2: " + String.format("%-" + 10 + "s", value2));
				out.print("= ");
				out.println(result);
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
