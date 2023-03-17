package basic_Java_Codes;

import java.util.Scanner;
public class DetermineNameOfDay_Month_Weekday {
	// solving using String Return

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Please enter the number of the day: ");
		int numberOfDay = input.nextInt();
		System.out.println("Please enter the number of the month: ");
		int numberOfMonth = input.nextInt();


		System.out.println("The number of the day you selected is " + numberOfDay);
		System.out.println("The number of the month you selected is " + numberOfMonth);

		System.out.println("The day you have chosen is " + nameOfDay(numberOfDay));
		System.out.println("The day you have chosen is " + nameOfMonth(numberOfMonth));
		isAWeekDay(numberOfDay);
	}
public static boolean isAWeekDay(int numberOfDay) {
	switch(numberOfDay) {
	case 0: System.out.println("Is not a Weekday");
		return true; // return type is bypassed so it doesnot matter if the boolean is true or false
		case 1:
			System.out.println("Is a Weekday");
			return true;
		case 2:
			System.out.println("Is a Weekday");
			return true;
		case 3:
			System.out.println("Is a Weekday");
			return true;
		case 4:
			System.out.println("Is a Weekday");
			return true;
		case 5:
			System.out.println("Is a Weekday");
			return true;
		case 6:
			System.out.println("Is not a Weekday");
			return true; // return type is bypassed so it doesnot matter if the boolean is true or false
		default:
			System.out.println("Error");
			return true;
			
	}
}
	public static String nameOfDay(int numberOfDay) {

		switch (numberOfDay) {
		case 0:

			return "Sunday";
		// use return "day" in this case no need to use break or String result
		case 1:

			return "Monday";


		case 2:

			return "Tuesday";

		case 3:

			return "Wednesday";

		case 4:

			return "Thursday";

		case 5:

			return "Friday";

		case 6:

			return "Saturday";

		default:

			return "Error in day number";


		}


	}

	public static String nameOfMonth(int numberOfMonth) {

		switch (numberOfMonth) {
		case 1:

			return "January";
		// use return "day" in this case no need to use break or String result
		case 2:

			return "Febuary";

		case 3:

			return "March";

		case 4:

			return "April";

		case 5:

			return "May";

		case 6:

			return "June";

		case 7:

			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";

		default:

			return "Error in monthnumber";

		}

	}
}

