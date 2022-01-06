import java.util.*;
import java.util.stream.*;

class IntArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(min(arr));
		List<Integer> arr2 = Arrays.stream(arr).boxed().collect(Collectors.toList());

		System.out.println(
				Collections.min(
					Arrays
						.stream(arr)
						.boxed()
						.collect(
							Collectors.toList()
						)
			)
		);
		// int[] arr = new int[20];
		// printArr(arr);
		// String[] stooges = {"a", "b", "c"};
		// printArr(stooges);
	}

	public static int min(int[] arr) {
		int output = Integer.MAX_VALUE;
		for (int a : arr)
			if (a < output)
				output = a;
		return output;
	}

	public static void printArr(int[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
		System.out.println("}");
	}
	public static <T> void printArr(T[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
		System.out.println("}");
	}
}
