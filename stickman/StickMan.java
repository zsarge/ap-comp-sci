class StickMan {
	private boolean waving;

	public StickMan() {
		waving = false;
	}

	public void print() {
		System.out.println(" O" + (waving ? " " : "/"));
		System.out.println("/|" + (waving ? "\\" : " "));
		System.out.println("/ \\");
		System.out.println("");
	}

	public void toggleWave() {
		waving = !waving;
	}
}

class StickManRunner {
	public static void main(String[] args) throws InterruptedException {
		StickMan man = new StickMan();

		while (true) {
			man.print();
			man.toggleWave();
			Thread.sleep(1000);
		}
	}
}

