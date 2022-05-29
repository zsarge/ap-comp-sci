import java.util.HashMap;
import java.util.Map;

class AlphaTester {
	private HashMap<Character, Integer> frequencies;

	public AlphaTester() {
		frequencies = new HashMap<>();
	}

	public void encode(String str) {
		for (Character c : str.toCharArray())
			if (frequencies.containsKey(c))
				frequencies.put(c, frequencies.get(c) + 1);
			else
				frequencies.put(c, 1);
	}

	public void printFrequencies() {
		for(Map.Entry<Character, Integer> entry : frequencies.entrySet())
			System.out.println(entry.getKey() + ": " + entry.getValue());
	}

	public static void main(String[] args) {
		AlphaTester at = new AlphaTester();
		at.encode("aaabbc");
		at.printFrequencies();
	}
}
