package basic_Java_Codes;

//Remove repetition or refactoring the multiplicationTable class
public class multiplicationTable2 {

	// Calling the print(int m2) method to print()
	void print() {
		print(5);
		// Calling the print(int m2, int from, int to) method to print()
		// print(5,1,10);
	}

	// Calling the print(int m2, int from, int to) method to print(int m2)
	void print(int m2) {
		print(m2, 1, 10);
	}

	void print(int m2, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(m2 + " * " + i + " = " + m2 * i);
		}
	}

}
