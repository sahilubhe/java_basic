package day_4;

public class Abstraction {

	int fuel = 50;
	int maxFuelCapacity = 55;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction bike = new Abstraction();
		bike.fuelbike();
		bike.fuelbike();
		bike.fuelbike();
		bike.fuelbike();
		bike.fuelbike();
		bike.fuelbike();
		bike.runbike();
	}

	void fuelbike() {
		if (maxFuelCapacity > fuel) {
			fuel += 1;
			System.out.println("Fuel: " + fuel);
		} else {
			System.out.println("Fuel Capacity is reached: " + fuel);
		}
	}

	void runbike() {
		for (int i = fuel; i > 0; i--) {
			if (i > 1) {
				fuel--;
				System.out.println("Fuel: " + fuel);
			} else {
				System.out.println("Please Fuel Up bike: ");
				break;
			}
		}
	}

}
