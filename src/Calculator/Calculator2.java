package Calculator;
/*
 * Exercise:
 *1. Create a class "Calc1" and add couple of methods such as  addition and subtraction
 *2. Create another class "Calc2" and couple of methods such as multiplication and division
 *3. Extend Calc1 into Calc2 
 *4. Create a main method in Calc2, and create an object for Calc2 and access the methods of Calc2 and
 * Calc1 as we extended Calc1 into Calc2.
 */

public class Calculator2 extends Calculator1 {
	
	public void multiplication(int num1, int num2) { // Method with Arguments
		int result = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + result);
	}
	
	public void division(int num1, int num2) { // Method with Arguments
		float result = num1 / num2;
		System.out.println("Division of " + num1 + " and " + num2 + " = " + result);
	}

	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		// calling the methods
		calc.addition(35, 54);
		calc.subtraction(29, 45);
		calc.multiplication(34, 15);
		calc.division(90, 5);
		calc.divide(12, 3);
		calc.cube(3);
	}
}
