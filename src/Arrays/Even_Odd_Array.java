package Arrays;

import java.util.Scanner;

// 5. Create an array of 10 values and write a program to print out only the odd numbers in the array.

public class Even_Odd_Array {
	public static void main(String[] args) {
		int num;	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array: ");	
		num = scan.nextInt();
		int a[] = new int[num];
		System.out.print("Enter all the elements: ");
        for (int i = 0; i < num; i++) {
        	a[i] = scan.nextInt();
        }
        System.out.print("Odd numbers: ");
        for(int i = 0 ; i < num ; i++) {
        	if(a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.print("\nEven numbers: ");
        for(int i = 0 ; i < num ; i++) {
            if(a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        scan.close();
    }
}
