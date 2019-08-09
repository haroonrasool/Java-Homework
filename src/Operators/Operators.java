package Operators;

public class Operators {

	public static void main(String[] args) {
		int a = 60;
		int b = 50;
		int c = 30;
		
		if(a>b & a>c ) {
			System.out.println(a + " is greater than " + b + " and " +c);
		} else if (b>c) {
			System.out.println(b + " is greater than " + a + " and " +c);
		} else {
			System.out.println(c + " is greater than " + a + " and " +b);
		}
			

	}

}
