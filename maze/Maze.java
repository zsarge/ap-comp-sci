class Maze {
	char[][] maze;

	public Maze(int length, int width) {
		maze = new char[length][width];
		
		for (int y = 0; y < length; y++)
			for (int x = 0; x < width; x++)
				maze[y][x] = '#';
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (char[] row : maze) {
			for (char c : row)
				sb.append(c);
			sb.append('\n');
		}
		
		return sb.toString().strip();
	}

	
}

class MazeRunner {
	public static void main(String[] args) {
		Maze m = new Maze(15, 15);
		System.out.println(m);
	}
}
