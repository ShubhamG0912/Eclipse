package Jan5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Adhar {

	public static void main(String[] args) {
		String n1 = "0123 4567 8912";
		//Pattern p3 = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\");
		Pattern p3 = Pattern.compile("[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]");
		Matcher m3 = p3.matcher(n1);
		
		if(m3.find()) {
			System.out.println("Adhar pattern Matched");
		}
		else
		{
			System.out.println("Adhar  pattern not matched");
		}

	}

}
