package basic_Java_Codes;

public class MyNumber_Runner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(6);
		number.isPrime();
		// divisible by 1 and itself only
		int sum = number.sumUptoN(); // sum ofnumber upto N
		// 1+2+3+4+5+6+7+8+9
		System.out.println("The sum is " + sum);
		int sumOfDivisors = number.sumOfDivisors(); // sum of divisor except 1 and num
		System.out.println("The sum of divisior is " + sumOfDivisors);
		number.printANumberTriangle();

	}

}
