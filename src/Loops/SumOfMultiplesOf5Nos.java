package Loops;

// 6. Please write a program to print numbers divided by 5 between 1 to 100.

public class SumOfMultiplesOf5Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 5 ; i <= 100; i += 5) {
			System.out.print(i + ", ");
			sum = sum + i;
		}
		System.out.println("\nThe sum of muliples of 5 numbers from 5 to 100 = " + sum);
	}
}
