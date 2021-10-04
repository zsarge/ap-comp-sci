import static java.lang.System.out;
import java.util.Scanner;

class If {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		out.print("Enter your class rank: ");
		int classRank = input.nextInt();
		out.print("Enter your ACT score: ");
		int act = input.nextInt();

		if (act >= 34)
			out.println("Welcome to Wassamatta U with honors!");
		else if (act >= 30 || classRank <= 10)
			out.println("Welcome to Wassamatta U!");
		else
			out.println("No Wassamatta U for you :(");
	}
}
