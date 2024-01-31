package Jan_4;

public class Main_Account1 {
    public static void main(String[] args) {
       
        SavingsAccount1 savingsAccount = new SavingsAccount1("John", 5000, 1000);
        CurrentAccount1 currentAccount = new CurrentAccount1("Alice", 3000, 2000);

      
        System.out.println("Savings Account Balance before withdrawal: INR " + savingsAccount.getBalance());
        savingsAccount.withdraw(2000);
        System.out.println("Savings Account Balance after withdrawal: INR " + savingsAccount.getBalance());

        System.out.println("\nCurrent Account Balance before withdrawal: INR " + currentAccount.getBalance());
        currentAccount.withdraw(5000);
        System.out.println("Current Account Balance after withdrawal: INR " + currentAccount.getBalance());
    }
}
