package Jan_Pac1;

public class TC_001_HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		int a,b,c,d,e;
		a=5;
		b=10;
		
		c=a+b;
		d=a-b;
		e=a*b;
		
		System.out.println("c value is "+ c);
		System.out.println("d value is "+ d);
		System.out.println("e value is "+ e);
		
		System.out.println("---------------");
		for (int i=0; i<5;i++)
		{
			System.out.println("Increment i "+i);
		}
		System.out.println("---------------");
		for (int i=5; i>0;i--)
		{
			System.out.println("decrement i "+i);
		}
	}

}
