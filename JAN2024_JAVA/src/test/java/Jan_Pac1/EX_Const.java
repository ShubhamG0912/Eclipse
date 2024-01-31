package Jan_Pac1;

public class EX_Const {
	
	int mathmarks;
	int scimarks;
	int engmarks;
	
	EX_Const (int math, int sci, int eng)
	{
		this.mathmarks=math;
		this.scimarks=sci;
		this.engmarks=eng;
	}
	
	public void total() {
		
		int totalmarks;
		totalmarks=mathmarks+scimarks+engmarks;
		System.out.println("Total marks is: "+totalmarks);
		
	}
}
