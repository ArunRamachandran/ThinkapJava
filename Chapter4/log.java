/* Objective : To learn & make use of 'return' statement */

class Logarithm {
	
	public static void printLogarithm(int n) {
		if (n <= 0.0) {
			System.out.println("Positive numbers only, please.");
			return; // Terminating the execution of method. Flow of execution 
				//  immediately returns to the caller.
		}
		double log = Math.log(n);
		System.out.println("The log of " + n +"is : " + log);
	}	

	public static void main(String args[]) {
		int x = -1, y = 9;
		printLogarithm(x);
		printLogarithm(y);
	}
}
