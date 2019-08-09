package Abstraction;

abstract class Shape {
	abstract void draw(); // NO implementation of the method
	final double PI = Math.PI;
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Circle extends Shape {
	void draw() { // implementation of the method
		System.out.println("Drawing Circle");
		double area;
		double radius = 5;
		area = radius * radius * PI;
		System.out.println("Area = " + area);
	}
}

class Rectangle extends Shape {
	void draw() { // implementation of the method
		System.out.println("Drawing Rectangle");
		double area;
		double length = 2, width = 3;
		area = length * width;
		System.out.println("Area = " + area);
	}
}

//In real scenario, method is called by programmer or user  
class Shape_Abstraction {
	public static void main(String args[]) {
		Shape s1 = new Circle(); //In a real scenario, object is provided through method, e.g., getShape() method
		s1.draw();
		Shape s2 = new Rectangle();
		s2.draw();
	}
}
