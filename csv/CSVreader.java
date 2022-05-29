class CSVreader {
	public static String getFieldFromLine(int fieldNumber, String line) {
		int count = 0;
		int i = 0;
		// seek to comma of index specified
		if (fieldNumber > 0) {
			for (; i < line.length(); i++) {
				if (line.charAt(i) == ',')
					count++;
				if (count == fieldNumber)
					break;
			}
			i++;
		}

		String output = "";
		while (i < line.length() && line.charAt(i) != ',') {
			output += line.charAt(i++);
		}

		return output;
	}

	public static void main(String args[]) {
		System.out.println(getFieldFromLine(0, "a,b,c"));
		System.out.println(getFieldFromLine(2, "a,bb,c"));
		System.out.println(getFieldFromLine(5, "a,bb,ccc,dd,eeeeeeeeee,f"));
		System.out.println(getFieldFromLine(6, "a,bb,ccc,dd,eeeeeeeeee,f"));
		System.out.println(getFieldFromLine(4, "a,bb,ccc,dd,eeeeeeeeee,f"));

		String line = "Moe,Larry,Curly";
		for (int i = 0; i <= 3; i++)
			System.out.println(getFieldFromLine(i, line));
	}
}
