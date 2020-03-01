package Encapsulation;

//A Java class to test the encapsulated class Account.  
public class TestAccount {
	public static void main(String[] args) {
		//creating instance of Account class
		Account acc = new Account();
		
		//setting values through setter methods
		acc.setAccNo(87654321);
		acc.setName("Haroon Rasool");
		acc.setEmail("haroon.rasool@gmail.com");
		acc.setAmount(123456789L);
		
		//getting values through getter methods
		System.out.println("Account No: " + acc.getAccNo());
		System.out.println("Name: " + acc.getName());
		System.out.println("Email: " + acc.getEmail());
		System.out.println("Amount: " + acc.getAmount());
	}
}
