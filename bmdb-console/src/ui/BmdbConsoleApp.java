package ui;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import util.Console;
import business.*;
import db.*;

public class BmdbConsoleApp {
	private static UserDB userDB = new UserDB();
	private static DAOUploadable<Movie> movieDAO = new MovieDB();
	private static DAOUploadable<Actor> actorDAO = new ActorDB();
	
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the Bootcamp Movie Database!");
		String command = "";
		
		while (!command.equalsIgnoreCase("exit")) {
			System.out.println("MENU:");
			System.out.println("show   - show all movies");
			System.out.println("add    - add a movie");
			System.out.println("get    - get a movie by id");
			System.out.println("gety - get all movies released in a certain year");
			System.out.println("del    - delete a movie by id");
			System.out.println("upload - bulk add files");
			System.out.println("exit   - exit app");
			System.out.println("showa - show all actors");
			System.out.println("adda - add actor");
			System.out.println("geta - get an actor by id");
			System.out.println("dela - delete an actor");
			System.out.println("login - user login");
			String[] validEntries = {"show", "add", "exit", "get", "del", "upload", 
					"showa","adda", "geta", "dela", "gety", "login"};
			command = Console.getChoiceString("Command: ", validEntries);
			switch (command) {
			case "show":
				//read all records from file and print to screen
				List<Movie> movies = movieDAO.getAll();
				if (movies.size() != 0) {
					System.out.println("Movie List:");
					System.out.println("===========");
					for (Movie m: movies) {
						System.out.println(m);
					}
				}
				else {
					System.out.println("Movie file empty");
				}
				break;
			case "add":
				//prompt user for all fields for a new movie
				System.out.println("Add a Movie:");
				System.out.println("============");
				//int id = Console.getInt("ID: ", 0, Integer.MAX_VALUE);
				String title = Console.getRequiredString("Title: ");
				String rating = Console.getRequiredString("Rating: ");
				int year = Console.getInt("Year: ", 0, Integer.MAX_VALUE);
				String director = Console.getRequiredString("Director: ");
				//create instance of movie
				Movie m = new Movie(title, rating, year, director);
				//call writeMovieRecord
				if (movieDAO.add(m)) {
					System.out.println("Movie added!");
				}
				else {
					System.out.println("Doh! Error adding movie");	
				}
				break;
			case "get":
				System.out.println("Get a Movie:");
				System.out.println("============");
				int id = Console.getInt("Movie ID: ", 0, Integer.MAX_VALUE);
				Movie movie = movieDAO.getById(id);
				if (movie != null) {
					System.out.println(movie);
				}
				else {
					System.out.println("Invalid movie ID.");
				}
				break;
			case "gety":
				System.out.println("Get all movies released in a year:");
				System.out.println("============");
				year = Console.getInt("Year: ", 0, Integer.MAX_VALUE);
				movies = ((MovieDB) movieDAO).getMoviesByYear(year);
				
				if (movies.size() != 0) {
					System.out.println("Movie List for " +year+":");
					System.out.println("===========");
					for (Movie movieByYear: movies) {
						System.out.println(movieByYear);
					}
				}
				else {
					System.out.println("Movie file empty");
				}
				break;	
			case "del":
				System.out.println("Delete a Movie");
				System.out.println("==============");
				id = Console.getInt("Movie ID: ", 0, Integer.MAX_VALUE);
				movie = movieDAO.getById(id);
				if (movie != null) {
					movieDAO.delete(movie);
					System.out.println("Movie successfully deleted!");
				}
				else {
					System.out.println("Invalid movie ID.");
				}
				
				break;
			case "upload":
				if (movieDAO.upload())
					System.out.println("Upload completed successfuly!");
				else
					System.out.println("Error in movie upload... check console.");
				break;
			case "showa":
				//read all records from file and print to screen
				List<Actor> actors = actorDAO.getAll();
				if (actors.size() != 0) {
					System.out.println("Actor List:");
					System.out.println("===========");
					for (Actor a: actors) {
						System.out.println(a);
					}
				}
				else {
					System.out.println("Actor file empty");
				}
				break;
			case "adda":
				System.out.println("Add an Actor:");
				System.out.println("============");
				String firstName = Console.getRequiredString("First name: ");
				String lastName = Console.getRequiredString("Last name: ");
				String gender = Console.getRequiredString("Gender: ");
				String strBirthDate = Console.getRequiredString("Birthdate (yyyy-mm-dd): ");
				LocalDate birthDate = LocalDate.parse(strBirthDate);
				//create instance of movie
				Actor a = new Actor(firstName, lastName, gender, birthDate);
				//call writeMovieRecord
				if (actorDAO.add(a)) {
					System.out.println("Actor added!");
				}
				else {
					System.out.println("Doh! Error adding actor");	
				}
				break;
			case "geta":
				System.out.println("Get an Actor:");
				System.out.println("============");
				id = Console.getInt("Actor ID: ", 0, Integer.MAX_VALUE);
				Actor actor = actorDAO.getById(id);
				if (actor != null) {
					System.out.println(actor);
				}
				else {
					System.out.println("Invalid actor ID.");
				}
				break;
			case "dela":
				System.out.println("Delete an Actor");
				System.out.println("==============");
				id = Console.getInt("Actor ID: ", 0, Integer.MAX_VALUE);
				actor = actorDAO.getById(id);
				if (actor != null) {
					actorDAO.delete(actor);
					System.out.println("Actor successfully deleted!");
				}
				else {
					System.out.println("Invalid actor ID.");
				}
				break;
			case "login":
				System.out.println("Login");
				System.out.println("=====");
				String un = Console.getRequiredString("Username: ");
				String pwd = Console.getRequiredString("Password: ");
				User authenticatedUser = userDB.login(un, pwd);
				if (authenticatedUser == null) {
					System.out.println("Invalid login!");
				}
				else {
					System.out.println("Successful login! Welcome, " 
				+authenticatedUser.getFirstName() + "!");
				}
				
				
				break;
			case "exit":
				break;
			}
			
		}
		
		System.out.println("bye");
	
	}
	
	
	

}
