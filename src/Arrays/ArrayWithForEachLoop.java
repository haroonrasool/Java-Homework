package Arrays;

// Exercise - II: 
// 1. Create an array of 10 String values and print using for-each loop

public class ArrayWithForEachLoop {

	public static void main(String[] args) {
		// dataType[] arrayRefVar; //double[] myList;  // preferred way.
			// or
		// dataType arrayRefVar[]; //double myList[]; // works but not preferred way.
		
		// dataType[] arrayRefVar = new dataType[arraySize];
			// or
		// dataType[] arrayRefVar = {value0, value1, ..., value99};
		// String[] petAnimals = {"Cat", "Dog", "Rabbit", "Hamster"};
		
		// double[] myList = new double[10];
			// or
		// double[] numbersList = {1.9, 2.9, 3.4, 3.5};
		
		String[] shoppingList = {"Flour", "Rice", "Eggs", "Bread", "Jam", "Butter", "Coffee", "tea", "Bagels", "Cake"};
		// Length of the array shoppingList
		System.out.println("Array Length is " + shoppingList.length);
		System.out.println();
		
		// Printing the items of the array using conventional For Loop
		System.out.println("Printing all items in the Array using conventional For Loop");
		for(int a = 0; a < shoppingList.length; a++) {
			System.out.print(shoppingList[a] + ", ");	
		}
		System.out.println("\n");
		
		// Printing the items of the array using the For-Each Loop
		// for(declaration : expression) {
			//Statements
		//	}
		System.out.println("Printing all items in the Array using the For-Each Loop");
		for (String str : shoppingList) {
			System.out.print(str + ", ");
		}
		
		System.out.println("\n");
		String[] animals = {"Bear", "Cat", "Dog", "Elephant", "Goat"};
		System.out.println("Printing the list of animals");
		for(String temp: animals) {
			System.out.print(temp + ", ");
		}
	}
}
// https://www.tutorialspoint.com/java/java_arrays.htm
