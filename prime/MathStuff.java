class MathStuff {
	public static void main(String[] args) {
		Timer timer = new Timer();
		double ot = 0.0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			// timer.start();
			// boolean l = isPrimeLong(i);
			// timer.stop();
			// double lt = timer.getTime();

			timer.start();
			boolean o = isPrimeOptimized(i);
			timer.stop();
			ot = timer.getTime();

			if (ot > 0.0) {
				System.out.print("I: " + i);
				// System.out.print(" Long: " + lt);
				System.out.println(" Op: " + ot);
				break;
			}

			if ( false) {
				System.out.print(i);
				// System.out.print("\tisPrimeLong = " + l);
				System.out.println("\tisPrimeOptimized = " + o);
			}
		}
	}

	public static boolean isPrimeLong(int n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public static boolean isPrimeOptimized(int n) {
		if (n % 2 == 0 && n != 2 && n != 0)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
			// if (n % (i * i) == 0)
				// return false;
		}
		return true;
	}
}
