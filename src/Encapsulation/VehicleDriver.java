package Encapsulation;

public class VehicleDriver {

	public static void main(String[] args) {
		// Initiate an object of Vehicle class to access its members i.e. Fields and Methods
		// Syntax: className objectName = new className();
		Vehicle car = new Vehicle(50, "green", 4, 5);
		// Vehicle truck = new Vehicle();
		// Vehicle cycle = new Vehicle();
		
		// car: getters
		System.out.println("Car size = " + car.getSize());
		System.out.println("Car color = " + car.getColor());
		System.out.println("Car wheels = " + car.getWheels());	
		System.out.println("Car gears  = " + car.getGears());
		
		// Cycle: getters
		Vehicle cycle = new Vehicle(25, "blue", 2, 8);
		System.out.println("Cycle size = " + cycle.getSize());
		System.out.println("Cycle color = " + cycle.getColor());
		System.out.println("Cycle wheels = " + cycle.getWheels());
		System.out.println("Cycle gears = " + cycle.getGears());
		System.out.println();
		
		// car: setters
		car.setSize(70);
		System.out.println("Car size = " + car.getSize());
		car.setColor("purple");
		System.out.println("Car color = " + car.getColor());
		car.setWheels(6);
		System.out.println("Car wheels = " + car.getWheels());
		car.setGears(10);
		System.out.println("Car gears = " + car.getGears());
	}
}
