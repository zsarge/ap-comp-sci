/* javac Loops.java && java Loops */
/* this is cursed */

public class Loops {
	public static void main(String args[]) {
		System.out.println("This is the same as 'x-- > 0'");
		int x = 11;

		while (x --> 0)
			System.out.println(x);

		System.out.println("'for' doesn't need statements");

		for (;;) {
			if (++x > 10) 
				break;
			else
				System.out.println(x);
		}

		System.out.println("we don't need braces");
		x = 0;

		for (;;)
			if (++x > 10) 
				break;
			else
				System.out.println(x);

		System.out.println("'for' can have multiple statements");

		for (int i = 0, j = 10; i < 10 && j > 0; i++, j--)
			System.out.println("(" + i + "," + j + ")");

		System.out.println("why break when you can return");

		while (true)
			if (x --> 0)
				System.out.println(x);
			else
				return;
	}
}
