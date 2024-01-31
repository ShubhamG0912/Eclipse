package Pac2;

public class Lab1_9UpperCase {
	
	public static void replaceupp(String str) {
		int length = str.length();
		for (int i= 0; i< length; i++)
		{
			if (i%2!=0)
			{
				System.out.println(str.toUpperCase().charAt(i));
			}
			else
			{
				System.out.println(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="invisible";
		replaceupp(str);
	}

}
