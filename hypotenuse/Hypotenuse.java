import java.util.*;

class Hypotenuse {
	public static void main(String args[]) {
		Scanner scannie = new Scanner(System.in);
		System.out.print("Please enter the base length of a right triangle: ");
		double b = scannie.nextDouble();

		System.out.print("Please enter the height of a right triangle: ");
		double a = scannie.nextDouble();

		System.out.println("The hypotenuse of that right triangle is " + hypotenuse(a, b));
	}

	public static double hypotenuse(double x, double y) {
		return Math.sqrt(x*x + y+y);
	}
} 
