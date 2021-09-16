
class Overloaded {
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add("a", "b"));
	}


	public static String add(Integer x, Integer y) {
		return "" + x + y;
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static String add(String x, String y) {
		return x + y;
	}
}

