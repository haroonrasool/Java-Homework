package Arrays;

public class Arrays {

	public static void main(String[] args) {
		// dataType[] arrayRefVar; //double[] myList;  // preferred way.
		
		// or
		
		// dataType arrayRefVar[]; //double myList[]; // works but not preferred way.
		
		// dataType[] arrayRefVar = new dataType[arraySize];
		// double[] myList = new double[10];
		
		// or
		
		// dataType[] arrayRefVar = {value0, value1, ..., valuek}; // dynamic size array
		// double[] myList = {1.9, 2.9, 3.4, 3.5};
		
		String[] shoppingList = new String[7]; // fixed size array
		
		shoppingList[0] = "Rice";
		shoppingList[1] = "Eggs";
		shoppingList[2] = "Bread";
		shoppingList[3] = "Jam";
		shoppingList[4] = "Butter";
		shoppingList[5] = "Coffee";
		shoppingList[6] = "tea";
//		shoppingList[7] = "salt"; // throws Array Index Out Of Bounds Exception
		
		System.out.println(shoppingList[1]);
		System.out.println(shoppingList[3]);
	
		System.out.println("Array Length is = " + shoppingList.length);

		System.out.println("Printing all items in the Array");
		// for (int a = 0; a <= 7; a++) // hard way
		for(int a = 0; a < shoppingList.length; a++) { // dynamic way
			System.out.print(shoppingList[a] + ", ");	
		}
	}
}
// https://www.tutorialspoint.com/java/java_arrays.htm