package Jan_4;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account smith= new Account("smith",50000);
		Account kathy= new Account("kathy", 40000);
		
		smith.deposit(5000);
		kathy.withdraw(2000);
		
		smith.displaybalance();
		kathy.displaybalance();
	}

}
