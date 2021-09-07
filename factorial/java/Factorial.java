import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Factorial {
	private static BigInteger factorial(int number) {
		BigInteger result = new BigInteger("1");

		for (int i = 1; i <= number; i++)
			result = result.multiply(new BigInteger(Integer.toString(i)));

		return result;
	}

	public static void main(String[] args) {
		List<BigInteger> factorials = new ArrayList<BigInteger>();

		for (int i = 1; i <= 10; i++)
			factorials.add(factorial(i));

		System.out.println(factorials);
	}
}

