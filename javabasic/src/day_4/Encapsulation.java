package day_4;

public class Encapsulation {
	
	int speed =5;
	String color = "blue";
	
	public static void main(String[] args) {
		Encapsulation bike = new Encapsulation();
		bike.color = "green";
		System.out.println("bike Current Speed: "+ bike.speed);
		bike.accelrateSpeed();
		bike.accelrateSpeed();
		bike.breakbike();
		bike.stopbike();
	}

	void accelrateSpeed() {
		speed = speed + 1;
		System.out.println("Accelerated Speed: "+speed);
	}

	void breakbike() {
		speed--;
		System.out.println("Break Speed: "+speed);
	}

	void stopbike() {
		speed = 0;
		System.out.println("bike Stopped & speed is "+speed);
		
	}

}
