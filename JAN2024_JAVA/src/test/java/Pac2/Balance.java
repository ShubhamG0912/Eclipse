package Pac2;

public class Balance {
	
	String name;
	double bal;
	public Balance(String n, double b)
	{
		name=n;
		bal=b;
	}
	
	public void showbalance() {
		if(bal>0)
		{
			System.out.println("Balance of : "+ name + "$"+ bal);
		}
	}

}
