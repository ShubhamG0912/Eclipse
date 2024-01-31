package Junit;

import org.junit.Test;

public class TC003_Person {

	@Test
	public void Test1() {
	TC002_Person p=new TC002_Person("Radhe" , "krishna");
	System.out.println(p.getFirstName());
			
	System.out.println(p.getLastName());		

	System.out.println(p.FullName());
}
}
