package Loops;

// 1b. Please write a program to find the factorial of given number

import java.util.Scanner;

public class Factorial_While_For_Loop {
	public static void main(String args[]){
		int i = 1, factorial = 1, number;
		System.out.println("Enter the number to which you need to find the factorial:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		// Finding the Factorial of a number using the While Loop.
		while(i <= number) {
			factorial = factorial * i;
			i++;
		}
		System.out.println("Factorial of " + number + " using the While Loop is: " + factorial);
		
		// Finding the Factorial of a number using the For Loop.
		long fact = 1;
		for(int k = 1; k <= number; k++) {
			fact = fact * k;
		}
		System.out.println("Factorial of " + number + " using the For Loop is: " + fact);
		sc.close();
	}
}
