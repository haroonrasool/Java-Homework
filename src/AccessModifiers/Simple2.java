package AccessModifiers;

class DEF {
	public DEF() {} // public constructor
	//private DEF() {} // private constructor  
	void message() {
		System.out.println("Message");
	}
}

public class Simple2 {
	public static void main(String args[]) {
		DEF obj = new DEF(); //Compile Time Error
		obj.message();
	}  
}