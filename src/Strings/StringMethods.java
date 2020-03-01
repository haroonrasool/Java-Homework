package Strings;
/**
 * Created by User on dd/mm/yyyy.
 */
public class StringMethods {
	public static void main(String[] args) {
		String text = "This is an automation testing class";
		// 1. Get the character at the given index within the String
		System.out.println("Character at 15th place: " + text.charAt(15));
		// 2. Concatenate a given string to the end of another string
		System.out.println(text.concat(" + " + text));
		// 3. Test if a given string contains the specified string
		System.out.println("Given text contains the word 'automation': " + text.contains("automation"));
		// 4. Check whether a given string ends with the contents of another string.
		System.out.println(text.endsWith("class"));
		// 5. Compare a given string to another string, ignoring case considerations.
		System.out.println("Given text equals (case sensitive): " + text.equals("This is an automation testing class"));
		System.out.println("Given text equals (ignore case): " + text.equalsIgnoreCase("this is an automation testing class"));
		// 6. Length of a given string.
		System.out.println("No. of characters in the String: " + text.length());
		// 7. Write a program to replace all the 'd' characters with 'f' characters
		String s1 = "dad, daisy, deer, desk, dime, dinosaur, dog, doll, dolphin, donkey, door, dove, down, and dump";
		String replaceString = s1.replace('d', 'f'); // replaces all occurrences of 'a' to 'e'
		System.out.println(replaceString);
		// 8. Write a program to get a substring of a given string between two specified positions.
		System.out.println(text.substring(22, 34)); // returns "testing clas"
		System.out.println(text.substring(24)); // returns "sting class"
		// 9. Convert all the characters in a string to Lower-case.
		System.out.println("Convert into Lowercase: " + text.toLowerCase());
		// 10. Convert all the characters in a string to Upper-case.
		System.out.println("Convert into Uppercase: " + text.toUpperCase());
		// 11. to verify if a string contains digits or not
//		String text4 ="AaBbCcDd 1234567890 XxYyZz 123";
		String text4 = "Software Testing Course 87698756 ffdhgfh 456456";
		System.out.println(text4 + " contains numbers: " + text4.matches(".*[1-9]")); // ending with numbers only.
		System.out.println(text4 + " contains numbers: " + text4.matches(".*[.*1-9]")); // within the string.
		System.out.println(text4 + " contains numbers: " + text4.matches("[1-9].*")); // ending with string.
		String text3 = "Software Testing Course87698756 ffdhgfh 456456";
		System.out.println(text3 + " contains numbers: " + text3.matches(".*[A-Za-z][1-9].*"));
	}
}
