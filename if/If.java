import static java.lang.System.out;
import java.util.Scanner;

class If {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String userChoice = "";
		out.print("Enter your choice (rock, paper, or scissors): ");
		String userChoice = input.nextLine().toLowerCase();
		String computerChoice = "";

		int rand = randInt(1,3);

		if (rand == 1)
			computerChoice = "rock";
		else if (rand == 2)
			computerChoice = "paper";
		else
			computerChoice = "scissors";

		out.println("You chose " + userChoice);
		out.println("Computer chose " + computerChoice);
	}

	public static int randInt(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1)) + min;
	}
}
