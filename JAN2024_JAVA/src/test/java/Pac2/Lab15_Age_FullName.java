package Pac2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lab15_Age_FullName {
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private double weight;
	
	public void printDetails() {
		System.out.println("Full Name: "+toString());
	    System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
	
	public int calculateAge(){
		LocalDate date1=LocalDate.now();
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter your DOB in yyyy-MM-dd");
	    String date=sc.nextLine();
	    sc.close();
			
	    System.out.println("Current date: "+ date1); 
		
		LocalDate d1=  LocalDate.parse(date);
		
		Period p1= d1.until(date1);
		int years= (int) p1.get(ChronoUnit.YEARS);	
			return years;
	}
	
	@Override
	public String toString() {
		return " [fname=" + fname + ", lname=" + lname + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lab15_Age_FullName obj = new Lab15_Age_FullName();
		 obj.fname="Shubham";
		 obj.lname="Gaikwad";
		 obj.gender="M";
		 obj.age=obj.calculateAge();
		 obj.weight=64.50;
		 obj.printDetails();
	}
}



