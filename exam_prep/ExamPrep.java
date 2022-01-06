class ExamPrep {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		for (int i = 0; i <= 12; i += 2) {
			System.out.println("\t\t\t" + i + " ");
			evenBlock(i);
		}
	}

	public static void evenBlock(int width) {
		if (width % 2 != 0) return;
		width = width / 2;

		int counter = 2;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
				if (i == j) {
					System.out.print(counter + " ");
					counter += 2;
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
}
