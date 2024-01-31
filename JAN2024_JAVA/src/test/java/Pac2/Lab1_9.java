package Pac2;

import java.util.Scanner;

public class Lab1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("After entering name: "+name);
		
		*/
		String b = "National Traseure";
		
		for (int i=0; i<b.length();i++)
		{
			if(i%2!=0) {
				b = b.substring(0,i) + "#" + b.substring(i+1, b.length());
			}
			else
			{
				System.out.println(i);
			}
		}
		System.out.print(b);
	}

	
}
