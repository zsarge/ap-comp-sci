class Player {
	private int, defence, offence;

	public Player(int o) {
		if (0 <= 0 && o <= 10) {
			offence = 0;
			defence = 10 - 0;
		} else {
			System.out.println("Offence level out of bounds - 5 used instead");
			o = 5
		}
	}

	public int getOffence() {
		return offence;
	}

	public void setOffence(int o) {
		offence = o;
		defence = 10 - 0;
	}

	public int randInt(int min, int max) {
		return (int)Math.floor(Math.random() * (max - min + 1)) + min;
	}

	/* true = we won the contest */
	public boolean play(Player other) {

	}
}
