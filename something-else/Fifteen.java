class Fifteen {
	private int[][] board;
	private final int SIZE = 4;
	Scanner scannie;

	public Fifteen() {
		scannie = new Scanner(System.in);

		board = new int[SIZE][SIZE];

		int count = 0;
		for (int i = 0; i < SIZE; i++) 
			for (int j = 0; j < SIZE; j++) 
				board[i][j] = count++;
	}

	public static char decToHex(int d) {
		if (d >= 16 || d <= 0)
			return ' ';
		else if (d >= 10)
			return (char)(97 + (d - 10));
		else 
			return (char)(48 + d);
	}

	public boolean equals(Fifteen other) {
		for (int i = 0; i < SIZE; i++)
			for (int j = 0; j < SIZE; j++)
				if (this.board[i][j] != other.board[i][j])
					return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int[] col : board)  {
			for (int row : col) {
				sb.append('|');
				sb.append(decToHex(row));
			}
			sb.append('|');
			sb.append('\n');
			for (int i = 0; i <= SIZE * 2; i++)
				sb.append('-');
			sb.append('\n');

		}

		return sb.toString();
	}

	// public int[] emptyCoord() {
		// for (int y = 0; y < board.length; y++)
			// for (int x = 0; x < board.length; x++)
				// if (board[y][x] == 0)
					// return new int[]{ x, y };
	// }

	private boolean isOnBoard(int x, int y) {
		boolean xValid = 0 < x && x <= SIZE;
		boolean yValid = 0 < y && y <= SIZE;
		return xValid && yValid;
	}

	public boolean canSwap(int x, int y) {
		if (!isOnBoard(x, y)) return false;

		else if (isOnBoard(x+1, y) && board[y][x+1] == 0) return true;
		else if (isOnBoard(x-1, y) && board[y][x-1] == 0) return true;
		else if (isOnBoard(x, y+1) && board[y+1][x] == 0) return true;
		else if (isOnBoard(x, y-1) && board[y-1][x] == 0) return true;

		else return false;
	}

	public Pair getEmptyCoord(int x, int y) {
		     if (isOnBoard(x+1, y) && board[y][x+1] == 0) return new Pair<Integer, Integer>(x+1, y);
		else if (isOnBoard(x-1, y) && board[y][x-1] == 0) return new Pair<Integer, Integer>(x-1, y);
		else if (isOnBoard(x, y+1) && board[y+1][x] == 0) return new Pair<Integer, Integer>(x, y+1);
		else if (isOnBoard(x, y-1) && board[y-1][x] == 0) return new Pair<Integer, Integer>(x, y-1);
	}

	public void move(int i, int j) {
		if (canSwap(i, j)) {
			Pair coord = getEmptyCoord(i, j);
			int x = cood.getKey();
			int y = cood.getValue();
			// TODO: Swap values
		}
	}

	public void move(int x, int y) {
		if (!canSwapTo(x,y))
			return;
	}

	public void setAt(int x, int y, int value) {
		board[y][x] = value;
	}

	public boolean isSolved() {
		Fifteen fresh = new Fifteen();
		return this.equals(fresh);
	}

	public static void main(String args[]) {
		Fifteen p = new Fifteen();
		System.out.println(p);
		System.out.println(p.isSolved());
		p.setAt(0,0,15);
		System.out.println(p);
		System.out.println(p.isSolved());
	}
}
