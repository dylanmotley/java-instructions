package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

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

		LocalDate july4th = LocalDate.parse("2021-07-04");
		System.out.println("July 4th: " + july4th);
		LocalDateTime laborDay = LocalDateTime.parse("2021-09-06T00:00");
		System.out.println("Labor Day: " + laborDay);

		System.out.println("getYear(): " + currentTimeStamp.getYear());
		System.out.println("getMonth(): " + currentTimeStamp.getMonthValue());
		System.out.println("getMonthValue(): " + currentTimeStamp.getMonthValue());
		System.out.println("getDayOfMonth(): " + currentTimeStamp.getDayOfMonth());
		System.out.println("getDayOfYear(): " + currentTimeStamp.getDayOfYear());
		System.out.println("getDayOfWeek(): " + currentTimeStamp.getDayOfWeek());
		System.out.println("getHour(): " + currentTimeStamp.getHour());
		System.out.println("getMinute(): " + currentTimeStamp.getMinute());
		System.out.println("getSecond(): " + currentTimeStamp.getSecond());
		System.out.println("getNano(): " + currentTimeStamp.getNano());

		if (currentTimeStamp.isBefore(laborDay)) {
			System.out.println("Today is before labor day");
		}
		if (christmas.isAfter(halloween)) {
			System.out.println("Duh");
		}

		// Comparing Holiday's
		System.out.println(halloween.compareTo(christmas));
		System.out.println(christmas.compareTo(july4th));

		LocalDateTime monthLaterThanToday = currentTimeStamp.withMonth(7);
		System.out.println(monthLaterThanToday);

		
		// 10 Weeks from today
		LocalDateTime tenWeeks = currentTimeStamp.plus(10, ChronoUnit.WEEKS);
		System.out.println(tenWeeks);
		
		LocalDateTime twoWeeks = currentTimeStamp.plusWeeks(2);
		System.out.println(twoWeeks);
		
		long daysUntilHalloween = currentTimeStamp.until(halloween, ChronoUnit.DAYS);
		System.out.println("Days Until Haloween: "+daysUntilHalloween);
		long daysBetween = ChronoUnit.DAYS.between(july4th, laborDay);
		System.out.println("Days Between: "+daysBetween);
		long monthsBetween = ChronoUnit.MONTHS.between(july4th, laborDay);
		System.out.println("Months Between: "+monthsBetween);
		
		
		
		System.out.println("Bye");
	}

}
