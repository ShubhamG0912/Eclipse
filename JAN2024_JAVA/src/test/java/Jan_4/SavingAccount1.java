package Jan_4;

class SavingsAccount1 extends Account1 {
    private final double minimumBalance;

    public SavingsAccount1(String accHolder, double initialBalance, double minimumBalance) {
        super(accHolder, initialBalance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal failed. Minimum balance requirement not met.");
            return false;
        }
    }
}

