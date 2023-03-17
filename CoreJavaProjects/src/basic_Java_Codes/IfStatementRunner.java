package basic_Java_Codes;

public class IfStatementRunner {

	public static void main(String[] args) {
		puzzle1();
		puzzle2();
		puzzle3();
		puzzle4();
	}

	private static void puzzle1() {
		int i = 26;
		if (i == 25) {
			System.out.println("i = 25");
		}
		else if (i == 24) {
			System.out.println("i = 24");
		} else {
			System.out.println("i is neither 25 or 24");
		}
	}

	private static void puzzle2() {
	int i=15;
	if (i < 20) {
		System.out.println("l<20");
	}
	if(i>20) {
		System.out.println("l>20");
	}
	else

	{
		System.out.println("Error");
	}
}

private static void puzzle3() {
	int i = 15;
	if (i > 20) {
		if (i < 20) {
			System.out.println("i<20");
		} else {
			System.out.println("Error");
		}
	}
}

private static void puzzle4() {
	int i = 5;
	if (i < 0) {
		i = i + 0;
	}
	i++;
	System.out.println(i);
}
}

// if , else if and if if = only one of the two statements can be executed as for three condition only the first correct satement would be executed and the next ones wont even be executed while in the second case it is possible for both of them to be executed.
