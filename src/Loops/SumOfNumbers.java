package Loops;

// 2. Please write a program to find the sum of 1 to 50 numbers

public class SumOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for(int i= 1 ; i <= 50; i++) {
			System.out.print(i + ", ");
			sum = sum + i;
		}
		System.out.println("\nThe sum of numbers from 1 to 50 = " + sum);
	}
}
