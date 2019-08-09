package Arrays;

// Exercise - II: 
// 2. Create an array of 10 integer values and print using while loop with iterator
//6. Create an array of 10 values and write a program to find the sum of all the elements in the array
public class While_Array {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Printing all the items in the Array using the conventional For Loop");
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
			sum = sum + numbers[i];
		}
		System.out.println("\nSum of al the items in the array is = " + sum);
		
		System.out.println("\n\nPrinting all the items in the Array using the For-Each Loop");
		for (int numArray : numbers) {
			System.out.print(numArray + ", ");
		}
		
		System.out.println("\n\nPrinting all the items in the Array using the While Loop");
		int i = 0;
		while(i < numbers.length) {
			System.out.print(numbers[i] + ", ");
			i++;
		}
		
// 3. Create an array of 6 values and store in this order: 23, 6, 47, 35, 2, 14. 
// Write a programme to get the average of all 6 numbers		
		int[] array = {23, 6, 47, 35, 2, 14};
		int sum2 = 0;
		int length = array.length;
		System.out.println("\n\nPrinting all the items in the array");
		for(int k = 0 ; k < length; k++) {
			System.out.print(array[k] + ", ");
			sum2 = sum2 + array[k];
		}
		System.out.println("\nSum of al the items in the array is = " + sum2);
		double average = (double)sum2/length;
		System.out.print("Average of all the array elements is = " + average);
	}
}
