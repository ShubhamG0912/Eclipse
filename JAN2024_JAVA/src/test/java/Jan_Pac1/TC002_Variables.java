package Jan_Pac1;

public class TC002_Variables {
	
	private double dblwdth;
	private double dblheight;
	private double dbldepth;  //instance variable
	
	private static int boxid; //static variable
	
	public double volume() 
	{
		dbldepth=10;
		dblheight=10;
		dblwdth=10;
		double deltemp;
		deltemp = dblwdth * dblheight * dbldepth;
		
		return deltemp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TC002_Variables obj = new TC002_Variables();
		System.out.println(obj.volume());
		
	}

}
