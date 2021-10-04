import static java.lang.System.out;
import java.util.Scanner;

class If {
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
	}

	public static int randInt(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1)) + min;
	}
}
