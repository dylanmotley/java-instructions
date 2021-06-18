package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeApp {

	public static void main(String[] args) {
		LocalDateTime currentTimeStamp = LocalDateTime.now();
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentTimeStamp);
		System.out.println(currentDate);
		
		LocalDate halloween = LocalDate.of(2021, 10, 31);
		LocalDate christmas = LocalDate.of(2021, Month.DECEMBER, 25);
		
		System.out.println(halloween);
		System.out.println(christmas);
		
		LocalDate july4th = LocalDate.parse("2021-7-4");
		System.out.println("July 4th: "+july4th);
		LocalDateTime laborDay = LocalDateTime.parse("2021-09-06T00:00");
		System.out.println("Labor Day: "+laborDay);

	}

}
