package Overriding;

	class MyBank extends Bank { // Child Class of Bank Class
		// Methods
		void openAccount() {
			System.out.println("Account has been opened in MyBank.");
		}
		
		void depositMoney() {
			System.out.println("Money has been deposited in MyBank.");
		}
		
		void transferMoney() {
			System.out.println("Money has been transfered in MyBank.");
		}

		public static void main(String[] args) {
			MyBank mb = new MyBank();
			mb.openAccount();
			mb.depositMoney();
			mb.transferMoney();
		}
}
