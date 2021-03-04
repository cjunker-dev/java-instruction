package business;

public class Movie {
	private double rating;
	private String title;
	private int year;
	public Movie(double rating, String title, int year) {
		super();
		this.rating = rating;
		this.title = title;
		this.year = year;
	}
	public Movie() {
		super();
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return title + " (" +rating + "), rating " +rating;
	}
	
	
	
	
}
