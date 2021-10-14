import java.util.*;

class StringStuff {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		System.out.println(str1 == str2);
	}
	public static void printDown(String str) {
		for (int i = 0; i < str.length(); i++)
			System.out.println(str.substring(i, i + 1));
	}
	public static String reverse(String str) {
		String output = "";
		for (int i = str.length(); i > 0; i--)
			output += str.substring(i-1, i);
		return output;
	}
	public static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	public static void printReverse(String str) {
		for (int i = str.length(); i > 0; i--)
			System.out.print(str.substring(i-1, i));
		System.out.println();
	}
}

