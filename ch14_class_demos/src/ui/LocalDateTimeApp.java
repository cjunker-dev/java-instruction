package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the date time app!!!");
		// p. 443
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDate stPattys = LocalDate.of(2021, 3, 17);
		LocalDate julyFourth = LocalDate.parse("2021-07-04");
		System.out.println(stPattys);
		System.out.println(julyFourth);
		
		System.out.println("Using today as an example:");
		System.out.println(" getYear = " + currentDate.getYear());
		System.out.println(" getMonth = " + currentDate.getMonth());
		System.out.println(" getMonthValue = " + currentDate.getMonthValue());
		System.out.println(" getDayOfMonth = " + currentDate.getDayOfMonth());
		System.out.println(" getDayOfYear = " + currentDate.getDayOfYear());
		System.out.println(" getDayOfWeek = " + currentDate.getDayOfWeek());
		/*System.out.println(" getHour = " + currentDate.getYear());
		System.out.println(" getMinute = " + currentDate.getYear());
		System.out.println(" getSecond = " + currentDate.getYear());
		System.out.println(" getNano = " + currentDate.getYear()); */
		//compare today to St PAtty's
		System.out.println("is today before st patty's? " + currentDate.isBefore(stPattys));
		System.out.println("is today after st patty's? " + currentDate.isAfter(stPattys));
		System.out.println("is today before st patty's? " + currentDate.compareTo(stPattys));

		// adjusting dates ad times p.448
		LocalDate weekFromNow = currentDate.withDayOfMonth(2).withMonth(3);
		System.out.println(weekFromNow);
		
		//p 451
		LocalDate twoWeeksFromNow = currentDate.plus(2, ChronoUnit.WEEKS);
		System.out.println(twoWeeksFromNow);
		
		LocalDate oneYearFromNow = currentDate.plusYears(1);
		System.out.println(oneYearFromNow);
		
		long days = currentDate.until(stPattys, ChronoUnit.DAYS);
		System.out.println(days + " days until St Patty's!");
		
		days = ChronoUnit.DAYS.between(stPattys, julyFourth);
		System.out.println(days + " days between st. patrick's and july 4th.");
		
		//p. 453 - format date type to be nice
		DateTimeFormatter sdf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mdf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter ldf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter fdf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		System.out.println("Today, short format: " + sdf.format(currentDate));
		System.out.println("Today, medium format: " + mdf.format(currentDate));
		System.out.println("Today, long format: " + ldf.format(currentDate));
		System.out.println("Today, full format: " + fdf.format(currentDate));
		
		
		System.out.println("bye");
	}

}
