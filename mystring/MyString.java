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
		while (str.charAt(offset) == other.charAt(offset)) {
			offset++;
		}
		return str.charAt(offset) - other.charAt(offset);
	}
	public static char charAt(String str, int index) {
		char[] chars = str.toCharArray();
		return chars[index];
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
		char[] chars = str.toCharArray();
		int len = 0;
		for (char c : chars)
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
		int endOfReplaceStr = find.length() + index ;
		int start = endOfReplaceStr > base.length()
			? base.length() : endOfReplaceStr;
		sb.append(base.substring(start));
		return replace(sb.toString(), find, replacer);
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
	public static void test(char a, char b) {
		System.out.print(a + " == " + b + ": ");
		System.out.println(a == b);
	}
}

/*
 *
 *           replace
 *             toLowerCase
 * Done:
 *         length
 *       indexOf
 * substring
 *   compareTo
 *     charAt
 * */
