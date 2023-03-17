package basic_Java_Codes;

import java.util.Scanner;

public class InteractionForMathematicsUsingIfElse {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int number1 = input.nextInt();
		System.out.println("The number you entered is - " + number1);
		System.out.print("Enter Number 2: ");
		int number2 = input.nextInt();
		System.out.println("The number you entered is - " + number2);
		System.out.println("1 - Addition");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.println("Choose an operation");
	
		int operation = input.nextInt();
		performOperationUsingNestedIfElse(number1, number2, operation);

	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int operation) {
		if (operation == 1) {
			System.out.println("The addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
		}
		else if (operation == 2) {
			System.out.println("The subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
		} else if (operation == 3) {
			System.out.println("The division of " + number1 + " and " + number2 + " is " + (number1 / number2));
		} else if (operation == 4) {
			System.out.println("The multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
		}
		else {
			System.out.println("Operation error");
			
		}
	}
}

