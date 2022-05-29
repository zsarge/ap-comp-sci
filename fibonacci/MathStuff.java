import java.util.HashMap;

class MathStuff {
	private HashMap<Integer, Integer> cache;

	public static void main(String[] args) {
		writeDownRec("I'm falling...");
	}

	public MathStuff() {
		cache = new HashMap<Integer, Integer>();
	}

	public static int tribonnaci(int n) {
		int a, b, c, d;
		b = c = d = 0;
		a = 1;
		for (int i = 0; i < n; i++) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		return d;
	}
	public static int lucas(int a, int b, int n) {
		int c;
		b = c = 0;
		a = 1;
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public int fibonnaci(int n) {
		int a, b, c;
		b = c = 0;
		a = 1;
		for (int i = 0; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public int fibonnaci2(int n) {
		if (n <= 1) {
			return n;
		} else if (cache.containsValue(n)) {
			return cache.get(n);
		} else {
			int answer = fibonnaci2(n - 1) + fibonnaci2(n - 2);	
			cache.put(n, answer);
			return answer;
		}
	}

	public static String reverse(String str) {
		if (str.length() <= 1) {
			return str;
		} else {
			return str.substring(str.length()-1, str.length()) + reverse(str.substring(0, str.length()-1));
		}
	}

	public static void writeDown(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i+1));
		}
	}

	public static void writeDownRec(String str) {
		if (str.length() <= 1)
			System.out.println(str);
		else {
			System.out.println(str.substring(0,1));
			writeDownRec(str.substring(1, str.length()));
		}
	}
} 
