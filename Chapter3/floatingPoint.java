// Java code to learn about basic floating point variables, Type casting & java methods

class floatingPoint {

	public static void main(String[] args) {
		
		// Familiarising with floating point variables

		double pi = 3.149;
		System.out.println("pi " + pi);

		double y = 1 / 3;
		System.out.print("y : ");
		System.out.println(y);

		y = 1.0 / 3.0;
		System.out.print("y : ");
		System.out.println(y);
		
		// Learning type casting

		int z = (int) pi; // Converting floating point value to int
		System.out.println("z : "+ z);

		double x = (int) pi * 20.0; // Typecasting
		System.out.println("x : "+ x);
	
		//Opeartions using Math class

		double root = Math.sqrt(17.0);
		System.out.println("root : "+ root);	

		System.out.println("Math.PI : " + Math.PI);
	}
}
