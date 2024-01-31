package Jan_Pac1;
import java.util.Scanner;
public class GetSetP_Details {

	    private String firstname;
	    private String lastname;
	    private char gender;
	    private String phone;  
		public GetSetP_Details(String firstname, String lastname, char gender, String phone) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.gender = gender;
			this.phone = phone;
			
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String num) {
			this.phone = num;
		}
		public GetSetP_Details() {
			super();
		}
		

	
}
