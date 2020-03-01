package Comparison;
/*
 * Exercise - I:
 *1. Write a program to find the greatest number among two values.
 *2. Write a program to compare three numbers and print the maximum value.
 *3. Write a program to compare three numbers and print the minimum value.
 */
public class Max {

	public static void main(String[] args) {
		// Calling methods in the main class.
		//max(5, 7);
		max(7, 18, 19);
	}
	
    // Method to find the maximum of two numbers and then returning the maximum value
    public static int max(int a, int b) {
    	int max;
    	if(a > b) {
    		max = a;
    		System.out.println("Max is a = " + a);
    		return max;
    	} else
    		System.out.println("Max is b = " + b);
    		max = b;
    	return max;
    }
    // Method to find the maximum of three numbers and then returning the maximum value
    public static int max(int a, int b, int c) {
    	int max;
    	if(a > b && a > c) {
    		max = a;
    		System.out.println("Max is a = " + a);
    		return max;
    	} else if (b > a && b > c) {
    		max = b;
    		System.out.println("Max is b = " + b);
    		return max;
    	} else
    			System.out.println("Max is c = " + c);
				max = b;
				return max;
    }
}
