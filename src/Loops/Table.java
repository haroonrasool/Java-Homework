package Loops;

import java.util.Scanner;

class Test {
	public void result(int num) {
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}


}

public class Table {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to print its table: ");
		int number = input.nextInt();
		Test obj = new Test(); // Creating the object of the class Test.
		obj.result(number);
		input.close();
	}
}
