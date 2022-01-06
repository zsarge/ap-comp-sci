
class ArrayStuff {
	public static void main(String[] args) {
		String[] arr = {"A", "B", "C"};
		Integer[] integerArray = {1,2,3,4,5};
		int[] intArray = {1,2,3,4,5};
		int[] intArray2 = {6,7,8};

		System.out.println(search(integerArray, 3));

		printArr(join(intArray, intArray2));
	}

	public static int[] join(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++)
			c[i] = a[i];
		for (int i = 0; i < b.length; i++)
			c[i + a.length] = b[i];
		return c;
	}

	public static int[] copy(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			output[i] = arr[i];
		return output;
	}

	public static <T> int search(T[] arr, T target) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i].equals(target))
				return i;
		return -1;
	}

	public static void printArr(int[] arr) {
		System.out.println("==Array==");
		for (int a : arr)
			System.out.println(a);
	}

	public static <T> void printArr(T[] arr) {
		System.out.println("==Array==");
		for (T a : arr)
			System.out.println(a);
	}
}
