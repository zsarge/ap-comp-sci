class Board {
	private final int SIZE = 10;

	private boolean turn;
	private char[][] board;
	private int sizes[];
	private Ship[] ships;

	public Board() {
		turn = false;
		board = new char[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++)
			for (int j = 0; j < SIZE; j++)
				board[i][j] = ' ';
		sizes = new int[]{ 5, 4, 3, 3, 2};
		ships = new Ship[sizes.length];
	}

	public void setBoard() {
		int turns = 5;
		while (turns > 0) {
			System.out.println("Player " + (turns % 2) + ": Enter your starting x location:");
			int x = scannie.nextInt();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("  0 1 2 3 4 5 6 7 8 9\n");
		for (int i = 0; i < SIZE; i++) {
			sb.append(i);
			sb.append('|');
			for (int j = 0; j < SIZE; j++) {
				sb.append(board[i][j]);
				sb.append('|');
			}
			sb.append('\n');
		}
		return sb.toString();
	}
}
