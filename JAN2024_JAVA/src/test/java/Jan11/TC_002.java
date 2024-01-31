package Jan11;

import java.util.ArrayList;
import java.util.Collections;

public class TC_002 {

			
		public static void main(String args[])  
		{  
		//creating an object of ArrayList class  
		ArrayList<String> list = new ArrayList<String>();  
		list.add("Amul");  
		list.add("Apple");  
		list.add("Amazon");  
		list.add("Adani");  
		list.add("Aurobindo");  
		list.add("Apex");  
		list.add("Aptech");  
 
		System.out.println("ArrayList Before Sorting:");  
		for(String products: list)  
		{  
		System.out.println(products);  
		}  
	 
		Collections.sort(list);  
		System.out.println("ArrayList After Sorting:");  
		for(String products: list)  
		{  
		System.out.println(products);  
		}  
		}  
		 
	}

