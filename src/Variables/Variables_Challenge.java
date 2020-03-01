package Variables;

// Write a program that reads a number in inches and converts it into meters.
// Note: One inch = 0.0254 meter or 1 meter = 39.3700787 inches
// Test Data: Input value for inch is 1000
// Expected output: 1000 inches is 25.4 meters.

public class Variables_Challenge {

	public static void main(String[] args) {
		
		double inchValue = 1000;
		double meterValue = inchValue * 0.0254;
		System.out.println(inchValue + " inches are equal to " + meterValue + " meters.");
	}
}

// https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-2.php
