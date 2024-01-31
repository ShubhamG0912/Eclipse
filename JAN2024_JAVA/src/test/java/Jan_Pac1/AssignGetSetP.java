package Jan_Pac1;

import java.util.Scanner;

public class AssignGetSetP {

	public static void main(String[] args) {
		
		GetSetP_Details details = new GetSetP_Details();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone Number: ");
		String num = sc.next();
		
		details.setFirstname("Vijay");
		System.out.println("First Name is: "+details.getFirstname());
		
		details.setLastname("Kumar");
		System.out.println("Last Name is: "+details.getLastname());
		
		details.setGender('M');
		System.out.println("Gender : "+ details.getGender());
		
		details.setPhone(num);
		System.out.println("Phone Number is:"+details.getPhone());
		
	}

}
