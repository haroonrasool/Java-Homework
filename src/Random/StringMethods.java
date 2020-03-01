package Random;
/**
 * Created by User on 13/10/2017.
 */
public class StringMethods {
	public static void main(String[] args) {
		String name = "SRIKANTH";
		System.out.println("No. of characters in the String: " + name.length());
		System.out.println("Character at 3rd place: " + name.charAt(2));
		System.out.println("Given text contains: " + name.contains("sri"));
		System.out.println("Given text equals: " + name.equals("Srikanth"));
		System.out.println("Given text equals (ignore case): " + name.equalsIgnoreCase("srikanTH"));
		System.out.println("Convert into Lowercase: " + name.toLowerCase());
		String name2 = "manual testing";
		System.out.println("Convert" + name2 + " into Uppercase: " + name2.toUpperCase());
		//to verify if string contains digits or not
		String name3 ="Automation Testing 123";
		System.out.println(name3 + "contains numbers: " + name3.matches(".*[1-9]"));//ending with numbers or numbers only
		System.out.println(name3 + "contains numbers: " + name3.matches(".*[.*1-9]"));//within the string
		System.out.println(name3 + "contains numbers: " + name3.matches("[1-9].*"));//ending with string
		
		String name4 = "Software Testing Course87698756 ffdhgfh 456456";
		System.out.println(name4.matches(".*[A-Za-z][1-9].*"));
	}
}
