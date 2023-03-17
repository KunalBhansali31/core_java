package basic_Java_Codes;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike honda = new MotorBike(100);
		System.out.println(honda.getSpeed());
		MotorBike ducati = new MotorBike(200);
		System.out.println(ducati.getSpeed());
		ducati.start();
		honda.start();
		ducati.setSpeed(100);
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(80);
		honda.increaseSpeed(100);
		honda.decreaseSpeed(300);
		System.out.println(honda.getSpeed());
	}

}
