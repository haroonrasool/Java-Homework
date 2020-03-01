package Inheritance;

public class Calc2 extends Calc1 {

	public void mul(int num1, int num2) {
		int c = num1 * num2;
		System.out.println("Multiplication of num1 and num2 is: " + c);
	}

	public void div(int num1, int num2) {
		int c = num1 / num2;
		System.out.println("Division of num1 and num2 is: " + c);
	}

	public static void main(String[] args) {
		Calc2 c2 = new Calc2();
		c2.add(24, 34);
		c2.sub(34, 5);
		c2.mul(10, 10);
		c2.div(25, 5);
	}
}
