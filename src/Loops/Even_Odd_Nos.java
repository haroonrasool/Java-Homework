package Loops;

// 3. Please write a program to print even numbers between 1 to 100.
// 4. Please write a program to print odd numbers between 1 to 100.

public class Even_Odd_Nos {
	public static void main(String[] args) {
		System.out.println("List of Even Numbers between 2 to 100 below:");
		for (int a = 2; a <= 100; a += 2) {
			System.out.print(a + ", ");
		}
		
		System.out.println("\nList of Odd Numbers between 1 to 99 below:");
		for (int a = 1; a <= 100; a += 2) {
			System.out.print(a + ", ");
		}
	}
}
