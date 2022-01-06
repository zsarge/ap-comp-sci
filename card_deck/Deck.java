import java.util.*;
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.Set;
// import java.util.List;

class Deck {
	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>(52);

		String[] suits = Card.getSuits();

		for (String suit : suits)
			for (int j = 1; j <= 13; j++)
				cards.add(new Card(j, suit));
	}

	public List<Card> getCards() {
		return cards;
	}

	public void shuffle() {
		for (int i = 0; i < cards.size(); i++) {
			cards.add(randInt(0, 51), cards.get(i));
			cards.remove(i);
		}
	}

	public boolean isFullDeck() {
		ArrayList<Card> fresh = new Deck().cards;
		ArrayList<Card> copy = new ArrayList<Card>(this.cards);
		if (copy.size() != fresh.size())
			return false;
		
		Collections.sort(fresh, new CompareCards());
		Collections.sort(copy,  new CompareCards());

		for (int i = 0; i < copy.size(); i++)
			if (!copy.get(i).equals(fresh.get(i)));
				return false;
		return true;
	}

	public static int randInt(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1)) + min;
	}
	public void print() {
		for (Card card : this.getCards())
			System.out.println(card);
	}

	public boolean checkForRepeats() {
		for (int i = 0; i < cards.size() - 1; i++)
			for (int j = i + 1; j < cards.size(); j++)
				if (cards.get(i).equals(cards.get(j)))
					return true;
		return false;
	}

	// public boolean transfer(Deck other, index) {
		// Card temp = cards.remove(index);
		// other.cards.add(temp);
	// }

	public static void main(String[] args) {
		Deck d = new Deck();
		// d.print();
		// System.out.println(d.checkForRepeats());
		// d.cards.remove(10);
		System.out.println(d.isFullDeck());
		// d.shuffle();
		// // d.print();
		// System.out.println("");

		// System.out.println(d.checkForRepeats());
		// System.out.println(d.isFullDeck());
	}
}

class Card {
	private int value;
	private String suit;

	public Card(int value, String suit) {
		setValue(value);
		setSuit(suit);
	}

	public static final String[] getSuits() {
		return new String[] {"diamond", "club", "spade", "heart"};
	}

	public boolean equals(Card other) {
		return this.value == other.value && this.suit.equals(other.suit);
	}

	public int compareTo(Card other) {
		return this.toString().compareTo(other.toString());
	}

	public void setSuit(String suit) {
		switch (suit) {
			case "club":
			case "spade":
			case "heart":
			case "diamond":
				this.suit = suit;
				break;
			default:
				throw new IllegalArgumentException("suit must be in (club, spade, heart, diamond)");
		}
	}

	public void setValue(int value) {
		if (value < 1 || value > 13)
			throw new IllegalArgumentException("value must be between 1 and 13 inclusive");
		this.value = value;
	}

	public String getValue() {
		switch (value) {
			case 1:
				return "Ace";
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			default:
				return Integer.toString(value);
		}
	}

	@Override
	public String toString() {
		return getValue() + " of " + suit + "s";
	}
}

class ArrayDeck {
	private Card[] cards;

	public ArrayDeck() {
		cards = new Card[52];

		String[] suits = Card.getSuits();
		int counter = 0;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 13; j++)
				cards[counter++] = new Card(j + 1, suits[i]);
	}


	public static void main(String[] args) {
		ArrayDeck d = new ArrayDeck();
		for (Card card : d.cards)
			System.out.println(card);
	}
}

class CompareCards implements Comparator<Card> {
	@Override
	public int compare(Card o1, Card o2) {
		return o1.compareTo(o2);
	}
}
