package basic_Java_Codes;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;

		}
	}

	public void setnoOfCopies(int noOfCopies) {

		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increasenoOfCopies(int howMuch) {
		setnoOfCopies(noOfCopies += howMuch);
	}

	public void decreasenoOfCopies(int howMuch) {
		setnoOfCopies(noOfCopies -= howMuch);
	}

	public int getnoOfCopies() {
		return noOfCopies;
}
}

