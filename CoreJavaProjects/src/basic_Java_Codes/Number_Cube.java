package basic_Java_Codes;

import java.util.Scanner;

public class Number_Cube {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int number = -1;
		do {
			if (number != -1) {
				System.out.println("The cube is " + (number * number * number));
			}
			System.out.println("Please enter a number: ");
			number = input.nextInt();
		} 
		while (number >= 0);
		System.out.println("Thank you");
	}

}