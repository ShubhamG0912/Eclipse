package Jan5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC001_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="Welcome";
		String pattern ="Welcome";
		
		boolean patternmatch = Pattern.matches(str1, pattern);
		
		System.out.println("Matching:"+patternmatch);
		
		String input="Shop, Mop,Hopping,Chopping";
		Pattern p1 = Pattern.compile("hop");
		Matcher m1 = p1.matcher(input);
		System.out.println(m1.matches());
		while(m1.find())
		{
			System.out.println(m1.group()+ " : "+ m1.start() + " : "+m1.end());
		}
		
		
		String s1 = "Welcome to Amazon 12345";
		Pattern p2 = Pattern.compile("^[A-Z].*[0-9]$");
		
		Matcher m2 = p2.matcher(s1);
		if(m2.find()) {
			System.out.println("Pattern matched");
		}
		else
		{
			System.out.println("Pattern Not Matched");
		}
		String n1 = "0123456789";
		//Pattern p3 = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\");
		Pattern p3 = Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		Matcher m3 = p3.matcher(n1);
		
		if(m3.find()) {
			System.out.println("Phoneno. pattern Matched");
		}
		else
		{
			System.out.println("phone no. pattern not matched");
		}
		
		String email = "Shubham1234@gmail.com";
		Pattern emailPattern = Pattern.compile("^(.+)@(\\S+).com");  //("^(.+)@(\\S).*(.com)$")
		Matcher email_m4= emailPattern.matcher(email);
		
		if(email_m4.find()) {
			System.out.println("Email pattern Matched");
		}
		else
		{
			System.out.println("Email pattern not matched");
		}
		
	}

}
