package Jan5;

public class TC__003Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		String str= null;
		str.equals("Hello");
		
}
catch(Exception e) {
	System.out.println("Exception is:" + e);
}
		System.out.println("Welcome");
	}

}
