package Interface;
/*
Exercise - II:
1. Create a Bank interface and declare banking operation methods and variables
2. Create classes BarclaysBank , LloydsBank or TescoBank.....
and implement the Bank interface methods in all the above classes
implement the method differently in different classes
3. Create TestBank class and access the methods of above classes
*/
interface Bank {
	float rateOfInterest();  
}

class BarclaysBank implements Bank {
	public float rateOfInterest() {
		return 9.15f;
		}
}

class LloydsBank implements Bank {
	public float rateOfInterest() {
		return 8.7f;
	}
}

class TescoBank implements Bank {
	public float rateOfInterest() {
		return 7.7f;
	}
}

class Bank_Interface {
	public static void main(String[] args) {
		Bank b;
		b = new BarclaysBank();
		System.out.println("Rate Of Interest: " + b.rateOfInterest() + "%");
		b = new LloydsBank();
		System.out.println("Rate Of Interest: " + b.rateOfInterest() + "%");
		b = new TescoBank();
		System.out.println("Rate Of Interest: " + b.rateOfInterest() + "%");
	}
}
