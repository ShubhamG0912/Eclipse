package Jan5;

import java.util.Scanner;

public class TC007_UserDefinedException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			emp e =new emp();
			e.getempdatails();
		}
		catch (AgeException e) {
			System.out.println("Age must be above 18");
		}
   
	}	
}	
	class AgeException extends Exception
	{
		private int age;
		
		AgeException (int a){
			age =a;
		}
		
		public String toString()
		{
			return age + "is an Invalid age";
		}	}

class emp {
	String name;
	int age;
	void getempdatails() throws AgeException {
		
		System.out.println("Enter yourn name: ");
		
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		Scanner sc1 = new Scanner(System.in);
		age = sc1.nextInt();
		
		if (age<18) {
			throw new AgeException (age);
		}
		else {
			System.out.println("It is an valid Age : "+ age);
		}
	}
}

	

		