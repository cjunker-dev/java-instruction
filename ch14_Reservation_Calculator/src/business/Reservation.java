package business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	//private int numberOfNights;
	//double totalPrice;
	private static final double NIGHTLY_RATE = 145.00;
	private DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	private NumberFormat currency = NumberFormat.getCurrencyInstance();

	
	
	public Reservation() {
		super();
	}

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		//mathy stuff - figure out num of days and total price
	}
	
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public String getArrivalDateFormatted() {
		return dtf.format(arrivalDate);
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public String getDepartureDateFormatted() {
		return dtf.format(departureDate);
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public int getNumberOfNights() {
		int numDays = (int)ChronoUnit.DAYS.between(arrivalDate, departureDate);
		return numDays;
	}
	public double getTotalPrice() {
		return getNumberOfNights() * NIGHTLY_RATE;
	}
	public String getTotalPriceFormatted() {		
		//this seems like the wrong way to do it!!!
		//return getNumberOfNights() * NIGHTLY_RATE;
		return currency.format(getTotalPrice());
	}
	public String getPricePerNightFormatted() {
		//formattedPrice = currency.format(formattedPrice);
		//double formattedPrice = NIGHTLY_RATE;
		//return formattedPrice;
		return currency.format(NIGHTLY_RATE);
	}
	
	public double getPrice() {
		return NIGHTLY_RATE;
	}
	
}
