package basic_Java_Codes;

public class WhileNumberPlayer {
	public int player;

	public WhileNumberPlayer(int player) {
		this.player = player;
	}

	public void printSquareUptoLimit() {
		int i = 1;
		while ((i * i) < player) {
			{
				System.out.print((i * i) + " ");
			i++;

		}

	}
	System.out.println();
}

public void printCubesUptoLimit() {
	int i = 1;
	while ((i * i * i) < player) {
		System.out.print((i * i * i) + " ");
		i++;
	}
	System.out.println();
}
}
