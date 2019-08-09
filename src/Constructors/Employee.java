package Constructors;

//Java Program to demonstrate the use of parameterised constructor

class Employee {
	// Attributes or Fields
	int id;
	String name;
	
	// creating a parameterised constructor  
	Employee(int i, String n) {
		id = i;
		name = n;
	}  
    
	// method to display the values  
	void display() {
		System.out.println("Employee ID: " + id + ", Name: " + name);
	}
       
	public static void main(String args[]) {
		// creating objects and passing values
		Employee emp1 = new Employee(123, "Ayyan");
		Employee emp2 = new Employee(456, "Salman");
		
		// calling the method to display the values of objects.
		emp1.display();
		emp2.display();
	}
}
