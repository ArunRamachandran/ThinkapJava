/* Objective :  Write a method called printAmerican that takes the day, date, month and year
 as parameter & that prints them in American format. eg: Saturday, July 16, 2011 */

class Date {

	public static void printDate(String day, String m, int d, int y) {
		System.out.println(day + ", " + m + " " + d + ", " + y);
	}	

	public static void main(String args[]) {
		String day, month;
		int date, year;

		day = "Saturday";
		month = "July";
		date = 16;
		year = 2011;

		printDate(day,month,date,year); // Invoking method printDate()		
	}
}
