import java.util.*;
class Loops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("please enter the password!");

		String s = "y";
		while (s.equals("y")) {
			System.out.println("...game is played...\nGood Game! Would you like to play again? [y/n]");
			s = scanner.nextLine();
		}
		
		System.out.println("Welcome to the matrix!");
	}
}
