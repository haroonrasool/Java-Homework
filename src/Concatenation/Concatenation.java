package Concatenation;

public class Concatenation {
	public static void main(String[] args) {
		
		String firstName = "John";
		
		String lastName = "Smith";
		
		String fullName = firstName + " " + lastName;
		
		String Message = "My Age is: ";
		
		int age = 26;
		
		System.out.println(fullName);
		
		System.out.println(firstName.concat(lastName)); // concat() method
		
		System.out.println(Message + age);

		System.out.println(age + firstName + " " + lastName + 45);

		System.out.println(fullName + age + 45 + 45);

		System.out.println(45 + 45 + fullName + age);
		
		System.out.println(fullName + " " + ((10+16)/45-34+(1/3)));
	}
}
