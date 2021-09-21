/*
   -
  - -
 - - -
- - - -

0 = 0
1 = 1
2 = 3
3 = 6
4 = 10

 */
class MathStuff {
	public static int triangle(int number) {
		int output = 0;
		for (int i = 1; i <= number; i++)
			output += i;
		return output;
	}

	public static int pyramid(int number) {
		int output = 0;
		for (int i = 1; i <= number; i++)
			output += i * i;
		return output;
	}

	public static void main(String args[]) {
		System.out.println("Triangle numbers:");
		for (int i = 0; i < 10; i++)
			System.out.println("" + i + " = " + triangle(i));

		System.out.println("Pyramid numbers:");
		for (int i = 0; i < 10; i++)
			System.out.println("" + i + " = " + pyramid(i));
	}
}
