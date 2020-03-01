package Constructors;

class Student {
	// Attributes or Fields
	int id;
	String name;

	// default constructor with no arguments/values
	Student() {
	}

	// parameterised constructor with arguments/values
	Student(int i, String nm) {
		id = i;
		name = nm;
	}

	// method to display the value of id and name
	void display() {
		System.out.println("ID = " + id + ", Name = " + name);
	}

	public static void main(String args[]) {
		// creating objects
		Student s1 = new Student(); // no values being passed
		Student s2 = new Student(123, "neha"); // some values being passed

		// displaying values of the object
		s1.display(); // no values
		s2.display(); // some values
	}
}
