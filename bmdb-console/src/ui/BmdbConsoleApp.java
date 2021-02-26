package ui;

import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import util.Console;

import business.Movie;
import db.DAO;
import db.DAOUploadable;
import db.MovieTextFile;

public class BmdbConsoleApp {
	private static DAOUploadable<Movie> movieDAO = new MovieTextFile();
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the Bootcamp Movie Database!");
		String command = "";
		
		while (!command.equalsIgnoreCase("exit")) {
			System.out.println("MENU:");
			System.out.println("show   - show all movies");
			System.out.println("add    - add a movie");
			System.out.println("get    - get a movie by id");
			System.out.println("del    - delete a movie by id");
			System.out.println("upload - bulk add files");
			System.out.println("exit   - exit app");
			String[] validEntries = {"show", "add", "exit", "get", "del", "upload"};
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
				int id = Console.getInt("ID: ", 0, Integer.MAX_VALUE);
				String title = Console.getRequiredString("Title: ");
				String rating = Console.getRequiredString("Rating: ");
				int year = Console.getInt("Year: ", 0, Integer.MAX_VALUE);
				String director = Console.getRequiredString("Director: ");
				//create instance of movie
				Movie m = new Movie(id, title, rating, year, director);
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
				id = Console.getInt("Movie ID: ", 0, Integer.MAX_VALUE);
				Movie movie = movieDAO.getById(id);
				if (movie != null) {
					System.out.println(movie);
				}
				else {
					System.out.println("Invalid movie ID.");
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
			case "exit":
				break;
			}
			
		}
		
		System.out.println("bye");
	
	}
	
	
	

}
