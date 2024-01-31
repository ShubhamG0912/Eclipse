//Lab3 Q1

package Jan5;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
	     employee.setFname(" ");
	     employee.setLname(" ");
	    
	        EmployeeName ck = new EmployeeName();
	        try {
	            ck.empdetails(employee.getFname(),employee.getLname());
	 System.out.println(" Enter Employee name  "+employee.getFname()+" "+employee.getLname());
	        } catch (InvalidNameException e) {
	            System.out.println("Invalid Name " + e.getMessage());
	        }
		    }
	}
 
