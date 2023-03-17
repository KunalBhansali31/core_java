package basic_Java_Codes;

public class MyNumber {
	private int num;

	MyNumber(int num) {
	this.num = num;
}
public void isPrime() {
	if (num == 1 || num == 2) {
		System.out.println("is a prime number");
	}
	else if (num > 2) {
		for (int i = 3; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("is not a prime number");
				break;
			} else {
			}
		}
	}
}

public int sumUptoN() {
	int i;
	int sum = 0;

	for (i = 1; i <= num; i++) {
		sum = sum + i;
	}
	return sum;
}

public int sumOfDivisors() {
	int sumOfDivisors = 0;
	for (int i = 2; i < num; i++) {
		if (num % i == 0) {
			sumOfDivisors = sumOfDivisors + i;
		}
	}
	return sumOfDivisors;
}

public void printANumberTriangle() {
	for (int i = 1; i <= num; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}

}

}
