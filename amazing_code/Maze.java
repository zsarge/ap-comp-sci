class Maze {
	int h, w;
	private char[][] m;

	public Maze(int height, int width) {
		h = (2 * height) - 1; // make sure h & w are odd
		w = (2 * width ) - 1;

		m = new char[h][w];

		for (int y = 0; y < h; y++)
			for (int x = 0; x < w; x++)
				if (x == 0 || y == 0 || y == h-1 || x == w-1)
					m[y][x] = '#';
				else
					m[y][x] = ' ';
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		

		sb.append("  ");
		for (int x = 0; x < w; x++)
			sb.append(x % 10);
		sb.append('\n');

		for (int y = 0; y < h; y++) {
			sb.append(y % 10);
			sb.append(' ');
			for (int x = 0; x < w; x++) {
				sb.append(m[y][x]);
			}
			sb.append('\n');
		}

		return sb.toString();
	}

	public static int randInt(int max, int min) {
		return (int) Math.floor(Math.random() * (max-min)) + min;
	}

	public void split() {
		int verticalLoc = randInt(2, w - 4);
		int horizontalLoc = randInt(2, w - 4);
		System.out.printf("(%d, %d)\n", verticalLoc, horizontalLoc);

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (i == horizontalLoc || j == verticalLoc) {
					m[i][j] = '#';
				}
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Maze maze = new Maze(4, 6);
			maze.split();
			System.out.println(maze);
		}
	}
}
