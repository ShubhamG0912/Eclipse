package Account_Abstract;

import java.util.UUID;

public abstract class Lab5_Account2 {
	
	private String accNum;
	public double balance;
	private String person;
	
	public Lab5_Account2(String accholder, double initialval) {
		this.accNum=UUID.randomUUID().toString();
		this.person=accholder;
		this.balance=initialval;
	}
	public void deposit(double amt ) {
		balance+=amt;
		System.out.println(amt + "Amount is deposited to your account number " +accNum);
	}	
	public abstract void withdraw(double amt );	
  
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getperson() {
		return person;
	}
	public void setperson(String person) {
		this.person = person;
	}
    public void display() {
    	System.out.println("Account number: "+accNum);
    	System.out.println("Person name: "+person);
    	System.out.println("Balance: "+balance);
    }
}





