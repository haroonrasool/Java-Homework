package Abstraction;

//Example of an abstract class that has abstract and non-abstract methods
abstract class MotorBike {
	MotorBike() {
		System.out.println("Abstract Motor Bike is Created");
		}
	abstract void run();
	
	void changeGear() {
		System.out.println("Gear Changed");
	}
}

//Creating a Child class which inherits Abstract class
class Honda extends MotorBike {
	void run() {
		System.out.println("Honda bike running safely..");
		}
}

//Creating a Child class which inherits Abstract class
class Suzuki extends MotorBike {
	void run() {
		System.out.println("Suzuki bike running safely..");
		}
}

//Creating a Test class which calls abstract and non-abstract methods
class Motorbike_Abstraction {
	public static void main(String args[]) {
		MotorBike obj; // Abstract_Class object;
		obj = new Honda();
		obj.run();
		obj.changeGear();
		obj = new Suzuki();
		obj.run();
		obj.changeGear();
	}
}
