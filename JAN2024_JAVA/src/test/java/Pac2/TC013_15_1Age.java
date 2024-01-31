package Pac2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class TC013_15_1Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.now();
		DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
		.append(DateTimeFormatter.ofPattern("yyyy-MMM-dd")).toFormatter();
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter your Date of Birth dd/mm/yyyy");
//		String dateofbirth = sc.nextLine();
		
		String dateofbirth="1995-DEC-09";
		System.out.println("You Entered: "+dateofbirth);
		System.out.println();
		LocalDate d1 = LocalDate.parse(dateofbirth, formatter);
		System.out.println(d1);
		
		Period p1 = date1.until(d1);
		System.out.println();
		System.out.println("Days : "+p1.get(ChronoUnit.DAYS));
		System.out.println("Months : "+p1.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+p1.get(ChronoUnit.YEARS));
	}

}
