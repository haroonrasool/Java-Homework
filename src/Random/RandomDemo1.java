package Random;
import java.util.Random;
/*
 * Exercise - V:
1. Create a class with a method which can generate random number and random email address, and random username
 */
public class RandomDemo1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Random random = new Random(100);
			int result = random.nextInt();
			
			String email = "sarah" + result + "@testmail.com";
			createUsers(email, ", Password");
		}
	}
	
	public static void createUsers(String email, String password) {
		System.out.println(email + password);
	}
}
