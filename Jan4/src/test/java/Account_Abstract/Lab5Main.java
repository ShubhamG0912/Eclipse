package Account_Abstract;

public class Lab5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab5_SavingAccount2 sav1 = new Lab5_SavingAccount2("Ram", 50000);
		Lab5_CurrentAccount2 cur1 = new Lab5_CurrentAccount2("Shyam", 90000);
		
		sav1.display();
		cur1.display();
		
		sav1.withdraw(2000);
		cur1.withdraw(1000);
	}

}
