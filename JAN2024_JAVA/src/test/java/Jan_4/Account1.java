package Jan_4;

import java.util.UUID;

class Account1 {
    protected String accNum;
    protected String accHolder;
    protected double balance;

    public Account1(String accHolder, double initialBalance) {
        this.accNum = UUID.randomUUID().toString();
        this.accHolder = accHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
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
        return "Account Number: " + accNum + "\nAccount Holder: " + accHolder + "\nBalance: INR " + balance;
    }

    public boolean withdraw(double amount) {
        return false;  
    }
}
