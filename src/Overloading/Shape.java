package Overloading;
/* Exercise-VIII:
 * 2. Create a class Shape with some shapes methods with same name to demonstrate Method Overloading
 * If a class has multiple methods having same name but different in parameters, it is known as Method Overloading. 
 */
public class Shape {
	public static void main(String[] args) {
		Shape obj = new Shape();
		System.out.println("Area of Rectangle = L * W = " + obj.area(5, 9));
		System.out.println("Area of Rectangle = L * W = " + obj.area(5.3, 9.2));
		System.out.println("Area of Triangle = L * W * H = " + obj.area(5, 9, 3));
		System.out.println("pi = " + Math.PI);
		System.out.println("Area of Circle = pi * r * r = " + obj.area(6.9f));
	}
	
	int area(int length, int width) {
		int area = length * width;
		return area;
	}
	
	double area(double length, double width) {
		double area = length * width;
		return area;
	}

	int area(int length, int width, int height) {
		int area = length * width * height;
		return area;
	}

	double area(double radius) {
		double area =  Math.PI * Math.pow(radius, 2);
		return area;
	}	
}
