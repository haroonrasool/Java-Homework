package Constructors;

public class MyTruck {
	public static void main(String[] args) {
		// Creating objects of the Class and passing value or arguments.
		Vehicle v3 = new Vehicle("Ford", "Black");
		Vehicle v4 = new Vehicle("Nissan", "Red", 4, 6);
		
		// calling the method to display the values of objects.
		v3.display();
		v4.display();
	}
}
