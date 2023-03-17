package basic_Java_Codes;

public class multiplicationTableRunner {

	public static void main(String[] args) {
		// Perform Multiplication table
		multiplicationTable m1 = new multiplicationTable();
		// Perform Multiplication table using no argument
		m1.print();
		// Perform Multiplication table using single argument
		m1.print(6);
		// Perform Multiplication table using multiple argument
		m1.print(6, 11, 20);

	}

}
