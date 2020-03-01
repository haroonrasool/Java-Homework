package Methods;

public class Methods {

	public static void main(String[] args) {
		// Calling the Methods
		addition1();
		addition1();
		addition1();
		addition2(4, 5, 3);
		max(15, 7);

		int result1 = multiplication(3, 3);
		System.out.println(result1);

		addition2(result1, 5, 8);
		int result2 = multiplicaton(3, 5, 9);
		System.out.println(result2);
	}

	public static void addition1() {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.println(sum);
	}

	public static void addition2(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}

	// Method to perform multiplication of 2 number and return the result
	public static int multiplication(int a, int b) {
		int mul = a * b;
		System.out.println(mul);
		return mul;
	}

	// method overloading (same method name but different parameters)
	public static int multiplicaton(int a, int b, int c) {
		int mul = a * b * c;
		System.out.println(mul);
		return mul;
	}

	// Method to find the maximum of two numbers and then returning the maximum
	// value
	public static int max(int a, int b) {
		int max;
		if (a > b) {
			max = a;
			System.out.println("Max No. is a = " + a);
		} else
			System.out.println("Max No. is b = " + b);
		max = b;
		return max;
	}
}
