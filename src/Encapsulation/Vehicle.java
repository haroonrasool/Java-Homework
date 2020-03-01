package Encapsulation;

public class Vehicle {

	// Attribute or Fields
	private int size;
	private int wheels;
	private int gears;
	private String color;
	
	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(100, "red", 5);
		
		System.out.println("Car size = " + car.size);
		System.out.println("Car wheels = " + car.wheels);
		System.out.println("Car gerars = " + car.gears);
		System.out.println("Car color = " + car.color);
		
		System.out.println("");
		Vehicle truck = new Vehicle(200, "white", 8, 5);
		System.out.println("Truck size = " + truck.size);
		System.out.println("Truck wheels = " + truck.wheels);
		System.out.println("Truck gears = " + truck.gears);
		System.out.println("Truck color = " + truck.color);
	}

	// Constructor #1
	Vehicle(int size, String color, int wheels, int gears) {
		this.size = size;
		this.color = color;
		this.wheels = wheels;
		this.gears = gears;
	}

	// Constructor #2
	Vehicle(String color, int wheels, int gears) {
		this.size = 150;
		this.color = color;
		this.wheels = wheels;
		this.gears = gears;
	}

	// Constructor #3
	Vehicle(int size, String color, int gears) {
		this.size = size;
		this.color = color;
		this.wheels = 14;
		this.gears = gears;
	}
	
	// Behaviours or Methods
	public void onOff() {
		System.out.println("Vehicle is on");
	}
	
	public void speedUp( ) {
		System.out.println("Vehicle is speeding up");
	}
	
	public void brake( ) {
		System.out.println("Vehicle is braking");
	}
	
	// Getters and Setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

//constructors characteristics.
//A constructor doesn’t have a return type.
//The name of the constructor must be the same as the name of the class.
//Unlike methods, constructors are not considered members of a class.
//A constructor is called automatically when a new instance of an object is created.