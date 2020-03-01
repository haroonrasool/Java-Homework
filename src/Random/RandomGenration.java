package Random;
import java.util.Random;

public class RandomGenration {
	public static void main(String[] args) {
		Random random = new Random();
		
		int result = random.nextInt(100); //generate random numbers
		String email = "srikanth" + result + "@testmail.com";
		createUsers(email, ", Password");
	}
	
	public static void createUsers(String email, String password) {
		System.out.println(email + password);
	}
}
