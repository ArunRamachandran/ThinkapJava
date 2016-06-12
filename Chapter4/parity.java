/* objective : to make use of conditional statements & Chained conditional statements in java */

class Parity {

	public static void printParity(int n) { // Conditional statements 
		if (n % 2 == 0) {
			System.out.println(n + " is an Even number :) ");
		} else {
			System.out.println(n + " is an Odd number :( ");
		}
	}

	public static void printType1(int n) { // Making use of -Chained Conditional statements-
		if (n > 0) {
			System.out.println(n + " is a +ve number !");
		} else if (n < 0) {
			System.out.println(n + " is a -ve number");
		} else {
			System.out.println(n + " is Zero");
		}
	}

	public static void printType2(int n) { //making use of - Nested conditional statements -
		if (n == 0) {
			System.out.println(n + "is Zero");
		} else {
			if (n > 0) {
				System.out.println(n + " is a +ve number !");
			} else {
				System.out.println(n + " is a -ve number ");
			}
		}
	}

	public static void main(String args[]) {
		int x = 7, y = 10, z = -9, a = 10;
		printParity(x);
		printParity(y);
		printType1(z); 
		printType2(a);
	}

}
