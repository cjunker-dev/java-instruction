package ui;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import business.Reservation;
import util.Console;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		int arrMonth = Console.getInt("Enter the arrival month (1-12):", 0, 13);
		int arrDay = Console.getInt("Enter the arrival day (1-31):", 0, 32);
		int arrYear = Console.getInt("Enter the arrival year:\n");

		int depMonth = Console.getInt("Enter the departure month (1-12):", 0, 13);
		int depDay = Console.getInt("Enter the departure day (1-31):", 0, 32);
		int depYear = Console.getInt("Enter the departure year:\n");
		Reservation res = new Reservation();
		//format and print out both the arrival date and departure date
		res.setArrivalDate(LocalDate.of(arrYear, arrMonth, arrDay));
		res.setDepartureDate(LocalDate.of(depYear,depMonth, depDay));
		
		System.out.println("Arrival Date: " + res.getArrivalDateFormatted());
		System.out.println("Departure Date: " + res.getDepartureDateFormatted());
		
		
		//list price per night
		//also format it so it looks good
		//final double PRICE = 145.00;
		System.out.println("Price: " + res.getPricePerNightFormatted() + "per night");
		
		
		res.getNumberOfNights();	
		//multiply num of nights by price
		//these should be pretty!!! not sure if bigdecimal? or just number.format
		System.out.println("Total price: " + res.getTotalPriceFormatted() 
		+ " for " + res.getNumberOfNights() + " nights");
		
		
		
		
		
		//ask to continue

		
		
		
		
		

	}

}
