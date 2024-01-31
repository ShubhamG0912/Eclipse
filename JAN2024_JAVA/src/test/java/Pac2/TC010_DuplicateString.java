package Pac2;

public class TC010_DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abbddyrtjjnvv";
		int inleng = input.length();
		System.out.println("Length of Strings: "+inleng);
		String output="";
		for (int i=0; i<input.length();i++) {
			for(int j=i+1; j<input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
//					output =output + input.charAt(i);
				input = input.substring(0, j) + " " + input.substring(j+1,inleng);
					//System.out.print(output);
				}				
			}
//			if(input.charAt(i) != ' ' ) {
//				output = output + input.charAt(i);
//			}
		}		
		for(int i=0; i<inleng; i++) {
			if(input.charAt(i) != ' ' ) {
				output = output + input.charAt(i);
			}
		}
		System.out.println(input);
		System.out.print(output);	
	}

}
