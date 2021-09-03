import java.util.Scanner;

class UserInput {
	public static void main(String[] args) {
		/* 
		 * Ruby be like:
		 * `puts gets`
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String input = scanner.nextLine();
		System.out.println(input);
		System.out.printf("Hello there \"%s\"!\n", input);
		scanner.close();
	}
}

