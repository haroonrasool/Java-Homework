package Calculator;
/*
 * Exercise:
 *1. Create a class "Calc1" and add couple of methods such as  addition and subtraction
 *2. Create another class "Calc2" and couple of methods such as multiplication and division
 *3. Extend Calc1 into Calc2 
 *4. Create a main method in Calc2, and create an object for Calc2 and access the methods of Calc2 and
 * Calc1 as we extended Calc1 into Calc2.
 */

public class Calculator1 {
	
	public void addition(int num1, int num2) { // Method with Arguments
		int result = num1 + num2;
		System.out.println("Additon of " + num1 + " and " + num2 + " = " + result);
	}
	
	public void subtraction(int num1, int num2) { // Method with Arguments
		int result = num1 + num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 + " = " + result);
	}
	
    // Method with Return value
    public float divide(int x, int y) {
    	float division = x / y;
    	System.out.println("Division of " + x + " and " + y + " = " + division);
    	return division;
    }
    
    public void cube(double x) {
    	double cube = x * x * x;
    	System.out.println("The cube of " + x + " = " + cube);
    }
} // end of class Calculator1
