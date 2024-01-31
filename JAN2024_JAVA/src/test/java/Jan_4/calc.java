package Jan_4;


class calc implements simplecalc
{
	 public int add(int a, int b) {
		 return a+b;
	 }

public static void main(String[] args) {
	
	calc cal= new calc();
	System.out.println(cal.add(20, 30));
}
}