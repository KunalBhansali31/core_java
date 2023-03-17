package basic_Java_Codes;

public class TeranryUse {
//Donot use it unless necessary as not used on large scale
	public static void main(String[] args) {
		boolean isEven; // default value of boolean is false
		String even = "";
		int i = 10;
		int j = 5;
		isEven = (i % 2 == 0 ? true : false);
		even = (i % 2 == 0 ? "Yes" : "No");
		j = (i - j == 5 ? 5 : 10);
		System.out.println(isEven);
		System.out.println(even);
		System.out.println(j);
	}

}
