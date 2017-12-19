import java.util.ArrayList;

public class GarageManager {

	public static void main(String[] args) {

		// public int weight; // numbers have no value
		// public int height;
		// public int enginePower;
		// public int numWheels;

		ArrayList<Vehicle> vehicleArray = new ArrayList<Vehicle>();

		// Cars
		vehicleArray.add(new Car(300, 2, 50, 500));
		vehicleArray.add(new Car(400, 2, 50, 300));
		vehicleArray.add(new Car(600, 7, 550, 500));
		vehicleArray.add(new Car(500, 9, 50, 600));
		// Tanks
		vehicleArray.add(new Tank(5000, 9, 50, 600));
		vehicleArray.add(new Tank(5000, 8, 50, 600));
		vehicleArray.add(new Tank(6000, 9, 50, 600));
		vehicleArray.add(new Tank(7000, 7, 50, 600));
		
		// MotorBike
		vehicleArray.add(new MotorBike(300, 1, 50, 600));
		vehicleArray.add(new MotorBike(200, 1, 50, 600));
		vehicleArray.add(new MotorBike(200, 1, 50, 600));
		vehicleArray.add(new MotorBike(250, 2, 50, 600));
		
		
		
		
		
		
	
		System.out.println(vehicleArray);
		

		
	
		
	}

}
