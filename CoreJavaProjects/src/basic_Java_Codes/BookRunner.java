package basic_Java_Codes;

public class BookRunner {

	public static void main(String[] args) {
		Book alpha = new Book(6);
		System.out.println("The number of copies in alpha are " + alpha.getnoOfCopies());
		Book beta = new Book(6);
		System.out.println("The number of copies in beta are " + beta.getnoOfCopies());
		alpha.setnoOfCopies(3);
		alpha.increasenoOfCopies(3);
		beta.setnoOfCopies(5);
		beta.decreasenoOfCopies(10);
		System.out.println("The number of copies in alpha are " + alpha.getnoOfCopies());
		System.out.println("The number of copies in beta are " + beta.getnoOfCopies());

	}

}
