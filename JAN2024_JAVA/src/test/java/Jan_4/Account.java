package Jan_4;

import java.util.UUID;

public class Account {

	private String accnum;
	private double balance;
	private String person;

	public Account(String accholdername, double intialbal) {
		
		this.accnum= UUID.randomUUID().toString();
		this.person =accholdername;
		this.setBalance(intialbal);
	}
	
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println(amount+ "is deposited to your accountnumber"+ accnum);
	}
	
	public boolean withdraw(double amount)
	{
		if (getBalance()>=amount)
		{
			setBalance(getBalance() - amount);
			System.out.println(amount + "is withdraw from you accuntnumber"+ accnum);
		}
		else
		{
			System.out.println("Inssuficient Balance");
		}
		return false;
	}
	
	public void displaybalance() {
		
		System.out.println("Account Number: "+ accnum);
		System.out.println("Account Holder name: "+ person);
		System.out.println("Balance: "+ getBalance());
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
