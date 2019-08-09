package Abstraction;
/*
Exercise - II:
1. Create a Bank interface and declare banking operation methods and variables
2. Create classes BarclaysBank , LloydsBank or TescoBank.....
and implement the Bank interface methods in all the above classes
implement the method differently in different classes
3. Create TestBank class and access the methods of above classes
*/
abstract class Bank { // abstract class
	abstract int getRateOfInterest(); // abstract method  
}

class BarclaysBank extends Bank {
	int getRateOfInterest() {
		System.out.println("Barclays Bank");
		return 7;
		}
}

class LloydsBank extends Bank {
	int getRateOfInterest() {
		System.out.println("Lloyds Bank");
		return 8;
		}
}

class TescoBank extends Bank {
	int getRateOfInterest() {
		System.out.println("Barclays Bank");
		return 9;
		}
}

class Bank_Abstraction { // main class
	public static void main(String args[]) {
		Bank b; // Abstract_Class object;
		b = new BarclaysBank();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
		b = new LloydsBank();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
		b = new TescoBank();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
	}
}
