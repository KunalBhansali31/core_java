package basic_Java_Codes;

public class multiplicationTable {
	// Method to print table of 5 or any number by changing the value of 5
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(5 + " * " + i + " = " + 5 * i);
		}
	}

//Method to print table of m1 using multiplicationTableRunner
	void print(int m1) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(m1 + " * " + i + " = " + m1 * i);
		}
	}

//Method to print table of m1 within the range of integer from and integer to
	void print(int m1, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(m1 + " * " + i + " = " + m1 * i);
		}
	}

}
