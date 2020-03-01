package Comparison;

import java.util.Scanner;

/*Exercise - II:
1. Write a program to print the result when you provide the total marks 
Pass -  if marks are more than 36% 
fail -  if marks are less than 36%

Exercise - III:
1. Write a program to print the grade when you provide the total marks 
Grade A - if marks are between 90% to 100%  
Grade B - if marks are between 70% to 89%
Grade C - if marks are between 37% to 69%
Just Pass - if marks are 36% 
Fail - if marks are less than 36%
*/
public class Results {
	public static void main(String[] args) {
		System.out.println("PLease enter your marks.");
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		
		if (marks >= 90)
			System.out.println("Your grade is A");
		else if (marks >= 70 && marks <= 89)
			System.out.println("Your grade is B");
		else if (marks >= 37 && marks <= 69)
			System.out.println("Your grade is C");
		else if (marks >= 36)
			System.out.println("Just Pass");
		else
			System.out.println("Fail");
		scan.close();
	}
}
