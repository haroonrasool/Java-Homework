package Encapsulation;

// An Account class which is a fully encapsulated class.
// It has a private data member and getter and setter methods.
class Account {
	//private data members
	private int accNo;
	private String name, email;  
	private long amount;

	//public getter and setter methods  
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
}