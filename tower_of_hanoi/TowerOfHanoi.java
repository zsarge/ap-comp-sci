import java.util.ArrayList;

class TowerOfHanoi {
	private ArrayList<Integer> top;
	private ArrayList<Integer> middle;
	private ArrayList<Integer> bottom;
	private int moves, height;

	public TowerOfHanoi(int height) {
		this.height = height;

		top = new ArrayList<Integer>();
		middle = new ArrayList<Integer>();
		bottom = new ArrayList<Integer>();

		for (int i = 0; i < height; i++)
			top.add(height-i);
	}

	private String rowToString(ArrayList<Integer> row) {
		StringBuilder sb = new StringBuilder();

		for (int space : row)
			sb.append("" + space + "-");

		while (sb.length() < height*2)
			sb.append("-");

		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(rowToString(top));
		sb.append('\n');
		sb.append(rowToString(middle));
		sb.append('\n');
		sb.append(rowToString(bottom));

		return sb.toString();
	}

	// private static boolean isInDecreasingOrder(ArrayList<Integer> arr) {
		// for (int i = 0; i < arr.length() - 1; i++)
			// if (arr.get(i) > arr.get(i+1))
				// return false;
		// return true;
	// }

	// private static int getLastNonZeroElement(int[] arr) {
		// for (int i = arr.length-1; i >= 0; i--)
			// if (arr[i] != 0)
				// return arr[i];
		// return 0;
	// }
	// PRE-CONDITION 0 <= a, b <= 2
	// public static void move(int a, int b) {

	// }

	public static void main(String[] args) {
		TowerOfHanoi tower = new TowerOfHanoi(5);
		System.out.println(tower);
	}
}
