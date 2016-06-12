class modulus {

	public static void getRemainder(int x, int y) {
		/* Modulus operator returns the remainder when the 1st operand is divided
			by the 2nd */
		int remainder;
		remainder = x % y;
		System.out.println("x % y : " + remainder);
	}

	public static void extractDigit(int d) {
		// Modulur operator can be used to extract the right most digit from a number
		int x = d % 10;
		System.out.println(d + " % 10 : " + x);
	}

	public static void main(String args[]) {
		int x = 7, y = 3, digit = 1476;
		System.out.println("x : "+ x + ", " + "y : " + y); 
		getRemainder(x,y);
		extractDigit(digit);
	}
}
