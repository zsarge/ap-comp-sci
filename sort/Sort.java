class Sort {
	public static void main(String[] args) {
		// int[] nums = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,2,6,4,8};
		int[] nums = {3,1,4,1,5,9,2,6};
		printArray(nums);
		System.out.print("   Bubble:\t");
		printArray(bubbleSort(nums));
		System.out.print("Selection:\t");
		printArray(selectionSort(nums));
		printArray(nums);

		// System.out.println(minIndex(bubbleSort(nums)));
		// System.out.println(minIndex(nums));

		// System.out.println(minIndex(new int[]{1}));
	}

	public static void printArray(int[] arr) {
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();
	}
	public static <T> void printArray(T[] arr) {
		for (T a : arr)
			System.out.print(a + " ");
		System.out.println();
	}

	public static int minIndex(int[] arr) {
		if (arr.length == 0)
			return -1;

		int minIndex = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[minIndex] > arr[i])
				minIndex = i;

		return minIndex;
	}

	public static int[] subArray(int[] arr, int index) {
		int[] dup = new int[arr.length - index];
		for (int i = index; i < arr.length; i++) {
			dup[i - index] = arr[i];
		}
		return dup;
	}

	public static int[] selectionSort(int[] arr) {
		int[] output = copy(arr);
		int len = arr.length;
		int temp = 0;
		int mindex = 0;
		if (len > 1) { 
			for (int i = 0; i < len - 1; i++) {
				// System.out.println("\t" + i + ": ");
				// System.out.println(i + ": ");
				// printArray(output);
				mindex = minIndex(subArray(output, i));
				// swap;
				temp = output[i];
				output[i] = output[mindex + i];
				output[mindex + i] = temp;
			}
		}
		return output;
	}

	public static int[] copy(int[] given) {
		int[] cop = new int[given.length];
		for (int i = 0; i < given.length; i++) {
			cop[i] = given[i];
		}
		return cop;
	}

	public static int[] bubbleSort(int[] given) {
		int[] arr = copy(given);
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					sorted = false;
				}
			}
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		int[] output = copy(arr);
		int len = output.length;
		int temp = 0;
		int mindex = 0;
		for (int i = 0; i < len - 1; i++) {
			j = i;
			while (j >= 0 && output[j] > output[j + 1]) {
				temp = output[j];
				output[j] = output[j+1];
				output[j+1] = temp;
				j--;
			}
		}
		return output;
	}
	// public static int[] insertionSort(int[] arr) {
		// int[] output = copy(arr);
		// int len = output.length;
		// int temp = 0;
		// int mindex = 0;
		// if (len > 1) {
			// for (int i = 0; i < len - 1; i++) {
				// mindex = minIndex( subArray(output, i) );
				// temp = output [0];
				// output[i] = output[mindex + i];
				// output[mindex + i] = output[i];
			// }
		// }
		// return output;
	// }

	// public static int[] insertForward(int[] arr, int to, int from) {
		// int len = arr.length;
		// int output[] = new int[len];
		// for (int i = 0; i < to; i++) {
			// output[i] = arr[i];
		// }
		// output[to] = arr[from];
		// for (int i = to + 1; i <= from; i++) {
			// output[i] = arr[i - 1];
		// }
		// for (int i = from + 1; i< len; i++) {
			// output[i] = arr[i];
		// }
		// return output;
	// }


} 
