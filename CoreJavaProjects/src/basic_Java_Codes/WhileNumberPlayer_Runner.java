package basic_Java_Codes;

public class WhileNumberPlayer_Runner {

	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer(30);
		player.printSquareUptoLimit();
		// for limit = 30 , output would be 1 4 9 16 25
		player.printCubesUptoLimit();
		// for limit = 30 , outputwould be 1 8 27
	}

}
