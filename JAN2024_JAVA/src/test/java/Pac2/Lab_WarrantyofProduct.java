package Pac2;

	import java.time.LocalDate;
	import java.time.Period;

	public class Lab_WarrantyofProduct {
	    public static void main(String[] args) {
	        LocalDate purchaseDate = LocalDate.of(2023, 12, 21);
	        int warrantyYears = 2;
	        int warrantyMonths = 6;

	        printWarrantyExpirationDate(purchaseDate, warrantyYears, warrantyMonths);
	    }

	    static void printWarrantyExpirationDate(LocalDate purchaseDate, int warrantyYears, int warrantyMonths) {
	       
	        Period warrantyPeriod = Period.ofYears(warrantyYears).plusMonths(warrantyMonths);

	        LocalDate expirationDate = purchaseDate.plus(warrantyPeriod);

	        System.out.println("Warranty expires on: " + expirationDate);
	    }
	}


