package Variables;

class Test { // default class
	static int a = 10; // static variable
	static int b = 20; // static variable
	static int product(int x, int y) { // static method
		return x * y;
	}
}

public class Static_Members {
	
	public static void main(String[] args) {
		
		Test t = new Test(); // Creating object of class Test
		int result = Test.product(5, 3); // Calling the static method by its class name
		
		System.out.println("Product of 5 and 3 = " + result);
		
		System.out.println("Calling Static Variable by Object Name: " + t.a); // static field should be accessed in a static way.
		System.out.println("Calling Static Variable by Object Name: " + t.b); // static field should be accessed in a static way.
		
		System.out.println("Calling static variable by Class Name: " + Test.a);
		System.out.println("Calling static variable by Class Name: " + Test.b);
	}
}
