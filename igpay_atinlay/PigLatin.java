import java.util.regex.Pattern;
import java.util.regex.Matcher;

class PigLatin {
	static final Pattern vowelPattern = Pattern.compile("[aeiou]+");

	public static boolean isVowel(String ch) {
		Matcher m = vowelPattern.matcher(ch);
		return m.matches();
	}

	public static void foo(String test) {
		Pattern a = Pattern.compile("[^aeiou]");
		Matcher m = a.matcher(test);
		System.out.println(m);
		System.out.println(m.find());
		if (m.matches())
			System.out.println(test.substring(m.start(), m.end()));
		else
			System.out.println("no match: " + test);
	}


	public static void main(String args[]) {
		foo("thoughts");
		// System.out.println(isVowel("h"));
		// System.out.println(isVowel("e"));
	}
}
