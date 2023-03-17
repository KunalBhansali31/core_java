package basic_Java_Codes;

import java.util.Scanner;

public class DetermineNameOfDay_Month_Weekday_2 {
	// solving using void return

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println("Please enter the number of the day: ");
		int numberOfDay = input.nextInt();
		System.out.println("Please enter the number of the month: ");
		int numberOfMonth = input.nextInt();
		System.out.println("The number of the day you selected is " + numberOfDay);
		System.out.println("The number of the month you selected is " + numberOfMonth);
		nameOfDay(numberOfDay);
		nameOfMonth(numberOfMonth);
		isAWeekDay(numberOfDay);

	}

	public static void isAWeekDay(int numberOfDay) {
		switch (numberOfDay) {
		case 0:
			System.out.println("Is not a Weekday");
			break;
		case 1:
			System.out.println("Is a Weekday");
			break;
		case 2:
			System.out.println("Is a Weekday");
			break;
		case 3:
			System.out.println("Is a Weekday");
			break;
		case 4:
			System.out.println("Is a Weekday");
			break;
		case 5:
			System.out.println("Is a Weekday");
			break;
		case 6:
			System.out.println("Is not a Weekday");
			break;
		default:
			System.out.println("Error");
			break;

		}
	}

	public static void nameOfDay(int numberOfDay) {

		switch (numberOfDay) {
		case 0:

			System.out.println("The day is Sunday");
			break;
		// or can use return "day" in this case no need to use break or result string
		case 1:
			System.out.println("The day is Monday");
			break;
		case 2:
			System.out.println("The day is Tuesday");
			break;

		case 3:
			System.out.println("The day is Wednesday");
			break;

		case 4:
			System.out.println("The day is Thrusday");
			break;

		case 5:
			System.out.println("The day is Friday");
			break;

		case 6:
			System.out.println("The day is Saturday");
			break;

		default:
			System.out.println("Error in day number");
			break;

		}


	}

	public static void nameOfMonth(int numberOfMonth) {

		switch (numberOfMonth) {
		case 1:

			System.out.println("The month is January");
			break;
		// or can use return "day" in this case no need to use break or result string
		case 2:
			System.out.println("The month is February");
			break;
		case 3:
			System.out.println("The month is March");
			break;

		case 4:
			System.out.println("The month is April");
			break;

		case 5:
			System.out.println("The month is May");
			break;

		case 6:
			System.out.println("The month is June");
			break;

		case 7:
			System.out.println("The month is July");
			break;
		case 8:
			System.out.println("The month is August");
			break;
		case 9:
			System.out.println("The month is September");
			break;
		case 10:
			System.out.println("The month is October");
			break;
		case 11:
			System.out.println("The month is November");
			break;
		case 12:
			System.out.println("The month is December");
			break;
		default:
			System.out.println("Error in day number");
			break;

		}

	}
}

