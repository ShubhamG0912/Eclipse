package Jan_Pac1;

public class Get_Set_Person {
	String firstname;
	String lastname;
	char gender;
	
	Get_Set_Person(String fname, String lname, char gen)
	{
		this.firstname=fname;
		this.lastname=lname;
		this.gender=gen;
	}
	
	public void personDetails() {
		
		String personDetails;
	 personDetails = firstname+lastname+gender;
		System.out.println("Person Details is: "+ personDetails);
		
	}
	
}
