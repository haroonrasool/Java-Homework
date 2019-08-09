package Constructors;

class Student {
	// Attributes or Fields
	int id;
	String name;
	
	// method to display the value of id and name
	void display() {
		System.out.println("ID: " + id + ", Name: " + name);
		}

	public static void main(String args[]) {
		// creating objects
		Student s1 = new Student();
		Student s2 = new Student();
		
		// displaying values of the object  
		s1.display();
		s2.display();
	}
}
