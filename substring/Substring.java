class Substring {
	public static void main(String[] args) {
		String str = "Hello, World!";
		try {
			System.out.println(str.substring(0, 4));
			System.out.println(str.substring(10, 4));
		} catch (StringIndexOutOfBoundsException s) {
			System.out.println("Something went terribly wrong");
		}

	}
}
