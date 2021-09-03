/* 
 * HelloWorld is a class that prints the following output:
 *
 * +---------------+
 * | Hello, World! |
 * +---------------+
 *
 */

class HelloWorld {
	// print the border on the top or bottom of text
	public static void printBorder(String input) {
		System.out.print("+");
		for (int i = 0; i < input.length(); i++)
			System.out.print("-");
		System.out.println("+");
	}

	// print a border, the text, and another border
	public static void printBanner(String input) {
		printBorder(input);

		System.out.print("|");
		System.out.print(input);
		System.out.println("|");

		printBorder(input);
	}

	public static void main(String[] args) {
		printBanner(" Hello, World! ");
	}
}

