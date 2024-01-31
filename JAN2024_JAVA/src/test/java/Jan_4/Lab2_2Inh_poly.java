package Jan_4;
import java.util.UUID;
public class Lab2_2Inh_poly {
	

	class Account {
	    protected String accNum;
	    protected String accHolder;
	    private double balance;

	    public Account(String accHolder, double initialBalance) {
	        this.accNum = UUID.randomUUID().toString();
	        this.accHolder = accHolder;
	        this.setBalance(initialBalance);
	    }

	    public void deposit(double amount) {
	        setBalance(getBalance() + amount);
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public String getAccNum() {
	        return accNum;
	    }

	    public String getAccHolder() {
	        return accHolder;
	    }

	    public void setAccHolder(String accHolder) {
	        this.accHolder = accHolder;
	    }

	    @Override
	    public String toString() {
	        return "Account Number: " + accNum + "\nAccount Holder: " + accHolder + "\nBalance: INR " + getBalance();
	    }

	    // Withdraw method to be overridden by subclasses
	    public boolean withdraw(double amount) {
	        return false;  // Default implementation, overridden in subclasses
	    }

		public void setBalance(double balance) {
			this.balance = balance;
		}
	}

	

}
