import java.util.*;

class MyString {
	public static void main(String[] args) {
		String test1 = "Hello World!";
		String test2 = "Hello John!";
		int index = 3;

		test(test1.substring(4), substring(test1, 4));
		test(test1.substring(4, 7), substring(test1, 4, 7));
		test(test1.compareTo(test2), compareTo(test1, test2));
		test(test1.indexOf("Hello"), indexOf(test1, "Hello"));
		test(test1.indexOf("ello"), indexOf(test1, "ello"));
		test(test1.indexOf("wllo"), indexOf(test1, "wllo"));
		test(test1.indexOf("orld"), indexOf(test1, "orld"));
		test(test1.length(), length(test1));
		test("".length(), length(""));
		test(test1.replace("l", "w"), replace(test1, "l", "w"));
		test(test1.replace("ll", "ww"), replace(test1, "ll", "ww"));
		test(test1.replace("", ""), replace(test1, "", ""));
		test(test1.replace("World", ""), replace(test1, "World", ""));
		test(test1.replace(" ", "_"), replace(test1, " ", "_"));
		test("abcdefg", toLowerCase("abcdefg"));
		test(test1.toLowerCase(), toLowerCase(test1));
		test("".toLowerCase(), toLowerCase(""));
		test(test1.contains("World"), contains(test1, "World"));
		test(test1.contains("oorld"), contains(test1, "oorld"));
	}
	/* Implement your methods here! */
	public static String substring(String str, int start) {
		return "";
	}
	public static String substring(String str, int start, int end) {
		return "";
	}
	public static int compareTo(String str, String other) {
		return -1;
	}
	public static boolean contains(String str, String searchString) {
		return false;
	}
	public static int indexOf(String str, String searchString) {
		return 0;
	}
	public static int length(String str) {
		return 0;
	}
	public static String replace(String base, String find, String replacer) {
		return "";
	}
	public static String toLowerCase(String str) {
		return "";
	}
	// feel free to make more private methods if you need to.

	/* -------- TESTING STUFF, DO NOT TOUCH -------- */
	public static void test(String a, String b) {
		System.out.print(a + " == " + b + ": ");
		System.out.println(a.equals(b));
	}
	public static void test(int a, int b) {
		System.out.print(a + " == " + b + ": ");
		System.out.println(a == b);
	}
	public static void test(boolean a, boolean b) {
		System.out.print(a + " == " + b + ": ");
		System.out.println(a == b);
	}
	public static void test(char a, char b) {
		System.out.print(a + " == " + b + ": ");
		System.out.println(a == b);
	}
}
// zack was here 
