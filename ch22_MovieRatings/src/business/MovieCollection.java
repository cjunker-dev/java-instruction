package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	private List<Movie> movieCatalog = new ArrayList<>();
	private int size = 0;
	
	
	public MovieCollection(List<Movie> movieCatalog, int size) {
		super();
		this.movieCatalog = movieCatalog;
		this.size = size;
	}

	
	public MovieCollection() {
		super();
	}


	public void add(Movie movie) {
		//add movie object to internal list
		movieCatalog.add(movie);
	}
	
	public List<Movie> filterMovies(Predicate<Movie> condition){
		// return a list of movie objects that meet the filter
		List<Movie> filteredMovies = new ArrayList<>();
		for (Movie m: movieCatalog) {
			if (condition.test(m)) {
				filteredMovies.add(m);
			}
		}
		return filteredMovies;
	}
	
	public double getLowestRating() {
		//should all use a map
		double min = movieCatalog.stream()
					.map(m -> m.getRating())
					.reduce(5.0,(a,b) -> Math.min(a, b));
		return min;
	}
	
	public double getHighestRating() {
		double max = movieCatalog.stream()
				.map(m -> m.getRating())
				.reduce(0.0,  (a,b) -> Math.max(a, b));
		return max;
	}
	
	public double getAverageRating() {
		double avg = (movieCatalog.stream().mapToDouble(m -> m.getRating()).average()).getAsDouble();
		return avg;
	}
	
	public int getSize() {
		//return number of items in internal list
		return size;
	}
	
	
	public List<Movie> getMovies() {
		return movieCatalog;
	}
}

