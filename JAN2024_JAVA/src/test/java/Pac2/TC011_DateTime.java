package Pac2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class TC011_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		Instant currenttime=Instant.now();
		System.out.println("Current Date & time: "+currenttime);
	
		LocalDate date1= LocalDate.now();
		LocalDate ind =LocalDate.of(1947, Month.AUGUST, 15);
		
		System.out.println("Current Date:"+ date1);
		System.out.println("Independence day: "+ind);
		
		System.out.println("Tomorrow: "+date1.plusDays(1));
		System.out.println("Last Month: "+date1.minusMonths(1));
	
		ZonedDateTime ct = ZonedDateTime.now();
		ZonedDateTime ctjapan = ZonedDateTime.now(ZoneId.of("Japan"));
		
		System.out.println("Indian Time : "+ct);
		System.out.println("Japan Current Time: "+ctjapan);
		Period p1 =date1.until(ind);
		System.out.println("Period: "+ p1);
		
		System.out.println("Days : "+p1.get(ChronoUnit.DAYS));
		System.out.println("Months : "+p1.get(ChronoUnit.MONTHS));
		System.out.println("Years : "+p1.get(ChronoUnit.YEARS));
	
	}

}
