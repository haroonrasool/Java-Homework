package Loops;

/*
In the Fibonacci series, the next number is the sum of the previous two numbers.
For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
The first two numbers of the Fibonacci series are 0 and 1.
There are two ways to write the Fibonacci series program in Java:
1:    Fibonacci Series without using recursion
2:    Fibonacci Series using recursion
*/

public class Fibonacci {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		int count = 10;

		for (int i = 0; i < count; i++) {
			System.out.print(num1 + ", ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
	}
}
