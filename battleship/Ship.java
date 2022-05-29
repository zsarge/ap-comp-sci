class Ship {
	private Point[] locations;
	private boolean[] hits;

	public Ship(int size, int xStart, int yStart, boolean isHorizontal) {
		locations = new Point[size];
		hits = new Point[size];

		if (isHorizontal) {
			for (int i = xStart; i < xStart + size; i++) {
				locations[i] = new Point(i, yStart);
			}
		} else {
			for (int i = yStart; i < yStart + size; i++) {
				locations[i] = new Point(xStart, i);
			}
		}
	}

	public boolean isOnShip(int x, int y) {
		if (isHorizontal) {
			return (start.getX() <= x) && (x <= start.getX() + size);
		} else {
			return (start.getY() <= y) && (y <= start.getY() + size);
		}
	}
}
