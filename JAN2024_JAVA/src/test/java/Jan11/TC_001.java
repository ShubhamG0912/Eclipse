package Jan11;

public class TC_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[];
		arr = new int[2];
		
		arr[0]=5;
		arr[1]=7;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println("-------------------------");
		
		int arr2[]= {100,200,300,400,500};
		for( int i:arr2) {
			System.out.println("for loop "+i);
		}
		
		
		System.out.println("-----------------------------");
		int arr1[]= {1,2,3,4,5};
		System.out.println(arr1.length);
		
		for (int i=0;i<arr1.length;i++) {
			
			System.out.println("for loop"+arr1[i]);
		}
		
		String twodim[][]= new String[2][2];
		
		System.out.println("Two dimesional length: "+twodim.length);
		
	twodim[0][0]="Apple1";
	twodim[0][1]="Apple2";
	twodim[1][0]="Apple3";	
	twodim[1][1]="Apple4";	
			
	System.out.println(twodim[0][1]);
				
				
	}

}
