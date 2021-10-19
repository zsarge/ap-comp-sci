class MyString {
	public static void main(String[] args) {
		String test1 = "Hello World!";
		test(test1.substring(4), substring(test1, 4));
		test(test1.substring(4, 7), substring(test1, 4, 7));
	}
	public static String substring(String str, int start) {
		StringBuilder sb = new StringBuilder();
		for (int i = start; i < str.length(); i++)
			sb.append(str.charAt(i));
		return sb.toString();
	}
	public static String substring(String str, int start, int end) {
		StringBuilder sb = new StringBuilder();
		for (int i = start; i < end; i++)
			sb.append(str.charAt(i));
		return sb.toString();
	}

	public static void test(String a, String b) {
		System.out.print(a + " == " + b + ": ");
		System.out.println(a.equals(b));
	}
}
