import java.util.*;

class TextAnimationSargent {
	private static String[][][] frames = {
		{ // Frame 0
			{" o                    "},
			{"                      "},
			{"                      "},
			{"                      "},
		},
		{ // Frame 1
			{"                      "},
			{"  o                   "},
			{"                      "},
			{"                      "},
		},
		{ // Frame 2
			{"                      "},
			{"                      "},
			{"   o                  "},
			{"                      "},
		},
		{ // Frame 3
			{"                      "},
			{"                      "},
			{"                      "},
			{"    o                 "},
		},
		{ // Frame 4
			{"                      "},
			{"                      "},
			{"     o                "},
			{"                      "},
		},
		{ // Frame 5
			{"                      "},
			{"      O               "},
			{"                      "},
			{"                      "},
		},
		{ // Frame 6
			{"      v               "},
			{"     >X<              "},
			{"      ^               "},
			{"                      "},
		},
		{ // Frame 7
			{"     \\|/              "},
			{"     -#-              "},
			{"     /|\\              "},
			{"                      "},
		},
		{ // Frame 8
			{"       .,             "},
			{"     ` ' `            "},
			{"      ` '             "},
			{"                      "},
		},
		{ // Frame 9
			{"                      "},
			{"                      "},
			{"       ' `            "},
			{"       '   `          "},
		},
		{ // Frame 10
			{"                      "},
			{"                      "},
			{"                      "},
			{"        `  '          "},
		},
		{ // Frame 11
			{"                      "},
			{"                      "},
			{"                      "},
			{"                      "},
		},
	};

	public static String verticalBorder = "#";
	public static String horizontalBorder = "#";

	public static void printBorder(int length) {
		for (int i = 0; i < length; i++)
			System.out.print(horizontalBorder);

		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {
		int width = frames[0][0][0].length() + 2;

		// print all frames
		for (String[][] frame : frames) {
			printBorder(width);
			// print columns in a frame
			for (String[] col : frame) {
				System.out.print(verticalBorder);

				// print the rows in the frame
				for (String row : col)
					System.out.print(row);

				System.out.println(verticalBorder);
			}
			printBorder(width);
			Thread.sleep(500);
			System.out.println();
		}
	}
}

