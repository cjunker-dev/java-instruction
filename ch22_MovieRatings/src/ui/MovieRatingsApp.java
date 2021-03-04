package ui;

import java.util.List;

import business.Movie;
import business.MovieCollection;
import util.Console;

public class MovieRatingsApp {
	public static void printMenu() {
		System.out.println("-----------------------");
		System.out.println("What do you want to do?");
		System.out.println("-----------------------");
		System.out.println("1 - Enter a movie");
		System.out.println("2 - View top rated movies");
		System.out.println("3 - View most recent movies");
		System.out.println("4 - View all movies");
		System.out.println("5 - View ratings");
		System.out.println("6 - Quit application");
	}
	public static void main(String[] args) {
		//new movie collection
		MovieCollection collection = new MovieCollection();		
		System.out.println("Welcome to the Movie Ratings app!");
		printMenu();
		int menuChoice = Console.getInt("Choose a menu option: ", 0, 7);
		while (menuChoice != 6) {
		switch(menuChoice) {
			case 1:
				int numberOfMovies = Console.getInt("How many movies do you want to enter? ", 0, 5);
				for (int i = 0;i <= numberOfMovies; i++) {
					Movie movie = new Movie();
					String movieTitle = Console.getRequiredString("Enter title: ");
					movie.setTitle(movieTitle);
					int movieYear = Console.getInt("Enter year: ");
					movie.setYear(movieYear);
					double movieRating = Console.getDouble("Enter rating between 1 and 5 (decimals OK) : ");
					movie.setRating(movieRating);
					collection.add(movie);
				}
				break;
			case 2:
				System.out.println("Movies rated 4.0 or higher");
				System.out.println("==========================");
				List<Movie> highestRated = collection.filterMovies(m -> m.getRating() >= 4.0);
				highestRated.stream().forEach(m -> System.out.println(m));
				break;
			case 3:
				System.out.println("Movies rated 4.0 or higher");
				System.out.println("==========================");
				List<Movie> recentMovies = collection.filterMovies(m -> (2021 - m.getYear()) <= 10);
				recentMovies.stream().forEach(System.out::println);
				break;
			case 4:
				System.out.println("All Movies (" + collection.getSize() + ")");
				System.out.println("===============");
//				for (Movie m: collection.getMovies()) {
//					System.out.println(m);
//				}
				collection.getMovies().stream().forEach(m -> System.out.println(m));
				break;
			case 5:
				System.out.println("Movie rating data");
				System.out.println("=================");
				System.out.println("# of movies" + collection.getSize());
				System.out.println("lowest rating: " + collection.getLowestRating());
				System.out.println("highest rating: " + collection.getHighestRating());
				System.out.println("average rating: " + collection.getAverageRating());
				break;
			case 6:
				break;
			default:
			
			
			
			
			}
			
			
			
			printMenu();
			
			
			
			
			
			
			
			
			menuChoice = Console.getInt("Choose a menu option: ", 0, 7);
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("bye");
	}

}
