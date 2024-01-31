package Pac2;

public class TC009_StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("Pooja");
		String str2= new String("SAM");
		System.out.println("String1: "+str1+"..........String2: "+str2 );
		String str3 = new String("pooja");
		String str4=str3;
		System.out.println("String1: "+str3+"..........String2: "+str4 );
	
		System.out.println("length:" +str1.length());
		System.out.println("indexOf:"+str1.indexOf("a"));
		String s1=" This is Beautiful day ";
		System.out.println(s1.substring(8,17));
		String s2="This is Good day      ";
		System.out.println(s2.trim()+s1.concat("hello"));
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.equals(s1));
		System.out.println(str1==s1);
		
		StringBuffer a= new StringBuffer("welcome");
		System.out.println(a.append("to 2024"));
		System.out.println(s1.concat(str4));
	
	
	
	
	
	}

}
