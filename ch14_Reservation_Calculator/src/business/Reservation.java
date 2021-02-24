package business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	LocalDate ArrivalDate;
	LocalDate DepartureDate;
	int numberOfNights;
	double totalPrice;
	final double PRICE = 145.00;

	
	
	public Reservation() {
		super();
	}

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		ArrivalDate = arrivalDate;
		DepartureDate = departureDate;
		//mathy stuff - figure out num of days and total price
	}
	
	public LocalDate getArrivalDate() {
		return ArrivalDate;
	}
	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dtf.format(getArrivalDate());
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public LocalDate getDepartureDate() {
		return DepartureDate;
	}
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		return dtf.format(getDepartureDate());
	}
	public void setDepartureDate(LocalDate departureDate) {
		DepartureDate = departureDate;
	}
	public int getNumberOfNights() {
		int numDays = (int)ChronoUnit.DAYS.between(ArrivalDate, DepartureDate);
		return numDays;
	}
	public double getTotalPrice(double price) {
		return this.getNumberOfNights() * price;
	}
	public double getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		//this seems like the wrong way to do it!!!
		return getNumberOfNights() * PRICE;
	}
	public double getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		//formattedPrice = currency.format(formattedPrice);
		double formattedPrice = PRICE;
		return formattedPrice;
	}
	
	public double getPrice() {
		return PRICE;
	}
	
}
