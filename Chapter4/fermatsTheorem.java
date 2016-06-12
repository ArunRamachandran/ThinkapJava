/* Excercise 4.5 : Code to check the  Fermat's last theorem - It says that there are no integers
		a, b, c such that 'a*n + b*n = c*n' , where n > 2 */

class Fermats {

	public static void checkFermat(int a, int b, int c, int n) {
		if (n <= 2) {
			System.out.println("Sorry..'n' should be greater than 2");
			return;
		} else {
			double lhs = Math.pow(a,n) + Math.pow(b,n);
			double rhs = Math.pow(c,n);
			if (lhs == rhs) {
				System.out.println("Holy smokes, Fermat was wrong!");
			} else {

				System.out.println("No, that doesn't work.");
			}
		}
	}

	public static void main(String args[]) {
		int a = 1, b = 2, c = 3, n = 4;
		checkFermat(a,b,c,n);
	}
}
