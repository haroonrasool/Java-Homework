package AccessModifiers;

class ABC {
	public int data1 = 40;
	private int data2 = 50;
	
	public void message() {
		System.out.println("This is a public message");
	}
	
	private void message2() {
		System.out.println("This is a private message");
	}
}

public class Simple {
	public static void main(String args[]) {
		ABC obj = new ABC(); // making object of class ABC
		System.out.println("Public Data: " + obj.data1);
		//System.out.println("Private Data: " + obj.data2); //Compile Time Error
		obj.message();
		//obj.message2();//Compile Time Error
	}
}
