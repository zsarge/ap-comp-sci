import static java.lang.System.out;

class If {
	public static void main(String[] args) {
		/*
		 * boolean coming = false;
		 * out.println("My aunt and uncle are " + (coming ? "" : "NOT ") + "coming.");
		 */

		int classRank = 1;
		int act = 36;

		if (false)
			if (act >= 30 || classRank <= 10)
				out.println("Welcome to Wassamatta U!");
			else
				out.println("Too bad :( - No Wassamatta U for you.");
		else
			out.println("No admissions");
	}
}
