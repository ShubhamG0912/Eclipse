package Jan5;

public class PersonAgeMain {

	public static void main(String[] args) {
	
		 try {
			 Person p1 = new Person("Monty", 36);
			   p1.getempdetails();
		   }catch(AgeException e){
			   System.out.println(e); 
		   }
	}
}
