/* Java code to learn methods with multiple parameters */

class printTime {
	
	public static void printTime(int h, int m, int s) {
		System.out.println("Invoked method - printTime");
		System.out.println(h + ":" + m + ":"+ s );
	}	

	public static void main(String args[]) {
		int hour, minute, second;
		hour = 10;
		minute = 25;
		second = 50;
		printTime(hour, minute, second);
	}	
}
