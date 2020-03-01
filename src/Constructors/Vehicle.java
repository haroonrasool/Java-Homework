package Constructors;
/*	Exercise-VII:
	1. Create a class with default and parameterised constructor methods
	to demonstrate constructor methods.
*/
public class Vehicle {
	// Attributes or Fields
	private String make;
	private String color;
	private int wheels;
	private int gears;
	
	// Default constructor with NO parameters
	Vehicle() {
		System.out.println("A Default Vehicle is created with no parts.");
		}
	
	// Constructor with two parameters
	Vehicle(String m, String c) {
		make = m;
		color = c;
	}
	
	// Constructor with three parameters
	Vehicle(String m, String c, int w, int g) {
		make = m;
		color = c;
		wheels = w;
		gears = g;
	}
	
	void display() {
		System.out.println("Make: " + make + "\nColor: " + color + "\nWheels: " + wheels + "\nGears: " + gears + "\n");
	}
	
	public static void main(String[] args) {
		// Creating objects of the Class and passing values or arguments.
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Mercedes", "White", 4, 6);
		
		// calling the method to display the values of objects.
		v1.display();
		v2.display();
	}
}
