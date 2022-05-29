import java.util.*;
import java.io.*;

class Main {
	public static void method1() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("states.txt"));

		StringBuilder unusedCharacters = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

		for (String line = br.readLine(); line != null; line = br.readLine()) {
			for (char c : line.trim().toLowerCase().toCharArray()) {
				int i = unusedCharacters.toString().indexOf(c);
				if (i != -1)
					unusedCharacters.deleteCharAt(i);
			}
		}

		System.out.println(unusedCharacters.toString());
	}

	public static void method2() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("states.txt"));

		String unusedCharacters = "abcdefghijklmnopqrstuvwxyz";

		for (String line = br.readLine(); line != null; line = br.readLine()) {
			for (char c : line.trim().toLowerCase().toCharArray()) {
				unusedCharacters = unusedCharacters.replace(String.valueOf(c), "");
			}
		}

		System.out.println(unusedCharacters.toString());
	}

	public static void main(String[] args) throws Exception {
		method1();
		method2();
	}
}
