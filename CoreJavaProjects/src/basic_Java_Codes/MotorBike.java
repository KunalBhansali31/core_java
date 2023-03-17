package basic_Java_Codes;

public class MotorBike {
	// state
	private int speed; // member variable
//no arg constructor
	MotorBike() {
	// calling the other constructor
//this(5); 	
}

	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;

	}

	public void setSpeed(int speed) {

		if(speed > 0) {
			this.speed = speed;
		} else {
				System.out.println("The speed can not be negative");
			}
	}


public void increaseSpeed(int howMuch) {
	setSpeed(this.speed += howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed -= howMuch);
			this.speed -= howMuch;

	}

	void start() {

		System.out.println("Bike Started");

	}

}

