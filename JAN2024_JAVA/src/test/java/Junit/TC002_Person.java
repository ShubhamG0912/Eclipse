package Junit;


public class TC002_Person {

	private String firstname;
	private String lastname;
	
	public TC002_Person(String fname , String lname )
	{
		if(fname== null && lname==null) {
			throw new IllegalArgumentException("Both Names cannot be Null");
			
		}
		this.firstname=fname;
		this.lastname=lname;	
	}
	public String FullName() {
		
		String first=(this.firstname != null)? this.firstname :"?";
		String last=(this.lastname != null)? this.lastname :"?";
		return first +" "+last;
	}
	
	public String getFirstName() {
		return this.firstname;
	}
	public String getLastName() {
		return this.lastname;
	}
	
	
	
//	public static void main(String[] args) {
		
//Person p=new Person("Radhe" , "krishna");
//System.out.println(p.getFirstName());
//		
//System.out.println(p.getLastName());		
//
//System.out.println(p.FullName());
		
//	}

}

