package Overriding;
/*
 * 	Exercise - IX:
	3. Create a class Bank with some banking methods(openAccount, depositeMoney, transferMoney etc...), 
	Create another class MyBank and Extend the class Bank
	and create the same methods as parent class Bank methods to implement method overriding.
 */
public class Bank { // Parent Class of MyBank Class
	// Methods
	void openAccount() {
		System.out.println("Account has been opened in Bank.");
	}
	
	void depositMoney() {
		System.out.println("Money has been deposited in Bank.");
	}
	
	void transferMoney() {
		System.out.println("Money has been transfered in Bank.");
	}
}
