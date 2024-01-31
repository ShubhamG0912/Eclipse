package Pac2;

import java.time.LocalDate;
import java.time.Period;

public class Lab12_DateDurationCalc {
	
	    public static void main(String[] args) {
	        
	        LocalDate startDate = LocalDate.of(2022, 10, 9);
	        LocalDate endDate = LocalDate.of(2023, 12, 9);
	        
	        Period period = Period.between(startDate, endDate);

	       
	        int years = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();

	        System.out.println("Duration: " + years + " years, " + months + " months, " + days + " days");
	    }
	}


