import java.util.*;

class MyString {
	public static void main(String[] args) {
		String test1 = "Hello World!";
		String test2 = "Hello John!";
		int index = 3;

		test(test1.substring(4), substring(test1, 4));
		test(test1.substring(4, 7), substring(test1, 4, 7));
		test(test1.compareTo(test2), compareTo(test1, test2));
		test(test1.charAt(index), charAt(test1, index));
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
		test('a', lowerChar('A'));
		test('z', lowerChar('Z'));
		test("abcdefg", toLowerCase("abcdefg"));
		test(test1.toLowerCase(), toLowerCase(test1));
		test("".toLowerCase(), toLowerCase(""));
		test(test1.contains("World"), contains(test1, "World"));
		test(test1.contains("oorld"), contains(test1, "oorld"));
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
	public static int compareTo(String str, String other) {
		int offset = 0;
		while (str.charAt(offset) == other.charAt(offset))
			offset++;
		return str.charAt(offset) - other.charAt(offset);
	}
	public static char charAt(String str, int index) {
		char[] chars = str.toCharArray();
		return chars[index];
	}
	public static boolean contains(String str, String searchString) {
		return indexOf(str, searchString) != -1;
	}
	public static int indexOf(String str, String searchString) {
		for (int i = 0; i < str.length() - searchString.length(); i++) {
			int matchTimes = 0;
			for (int j = 0; j < searchString.length(); j++) {
				if (str.charAt(j + i) == searchString.charAt(j))
					matchTimes++;
				else
					break;
			}
			if (matchTimes == searchString.length())
				return i;
		}
		return -1;
	}
	public static int length(String str) {
		int len = 0;
		for (char c : str.toCharArray())
			len++;
		return len;
	}
	public static String replace(String base, String find, String replacer) {
		if (find.equals("") || base.equals(""))
			return base;
		int index = base.indexOf(find);
		if (index == -1)
			return base; // base case for recursion
		StringBuilder sb = new StringBuilder();
		sb.append(base.substring(0, index));
		sb.append(replacer);
		int start = find.length() + index;
		sb.append(base.substring(start));
		return replace(sb.toString(), find, replacer);
	}
	public static String toLowerCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray())
			sb.append(lowerChar(c));
		return sb.toString();
	}
	private static char lowerChar(char c) {
		if ((int) c >= 'A' && (int) c <= 'Z')
			return (char) ((int) c + 32);
		else
			return c;
	}
	/* ---------------- */
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
