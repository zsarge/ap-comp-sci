class MathStuff {
	public static int randRange(int a, int b) {
		return (int)Math.floor(Math.random() * (b - a + 1) + a);
	}

	public static void main(String args[]) {
		for (int i = 0; i < 20; i++)
			System.out.print(randRange(1, 10) + ", ");
		System.out.println(randRange(1, 10));
	}
}
