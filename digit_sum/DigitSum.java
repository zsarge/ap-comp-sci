class DigitSum {
	public static void main(String[] args) {
		for (int i = 0; i < 200; i++) {
			System.out.print(i + " = ");
			System.out.println(digitSum(i));
		}
	}
	public static int digitSum(int n) {
		int output = 0;
		while (n > 0) {
			output += n % 10;
			n /= 10;
		}
		return output;
	}
}
