class newLine {

	public static void main(String[] args) {
		System.out.println("FIrst line.");
		newLine(); 
		threeLine();
		System.out.println("Second line.");
	}

	/* defining a new custom method */

	public static void newLine() {
		// This method returns an empty string
		System.out.println("");
	}

	public static void threeLine(){
		newLine(); newLine(); newLine();
	}
}
