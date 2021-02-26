package db;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieTextFile implements DAOUploadable<Movie> {
	private static final String MOVIE_FILE_NAME = "movies.txt";
	private static final String MOVIE_UPLOAD_FILE_NAME = "movie-upload.txt";
	List<Movie> movies = new ArrayList<>();

	public MovieTextFile() {
		getAll();
	}

	@Override
	public Movie getById(int id) {
		Movie m = null;
		for (Movie movie: movies) {
			if (movie.getId() == id) {
				m = movie;
			}
		}
		return m;
	}

	@Override
	public List<Movie> getAll() {
		//should be similar to readMovieRecords()
		//p.477
		if (movies.size() == 0) {
			try {
				BufferedReader in = new BufferedReader(
								  new FileReader(MOVIE_FILE_NAME));
				String line = in.readLine();
				while (line != null) {
					//this is object mapping in core JAva!!!!
					String[] fields = line.split("\t");
					//after split we should have 5 fields per line
					String idStr = fields[0];
					int id = Integer.parseInt(idStr);
					String title = fields[1];
					String rating = fields[2];
					String yearStr = fields[3];
					int year = Integer.parseInt(yearStr);
					String director = fields[4];
					
					Movie m = new Movie(id, title, rating, year, director);
					movies.add(m);
					//get the next line in the file
					line = in.readLine();
				}
				in.close();
				}
				catch (Exception e){
					System.out.println("Error getting movie records from file.");
					e.printStackTrace();
				}
		}
		return movies;
	}

	@Override
	public boolean add(Movie newMovie) {
		movies.add(newMovie);
		return saveAll();
	}

	private boolean saveAll() {
		boolean success = true;
		Path moviesPath = Paths.get(MOVIE_FILE_NAME);
		File moviesFile = moviesPath.toFile();
		
		try (PrintWriter out = new PrintWriter(
							  new BufferedWriter(
							  new FileWriter(moviesFile)))) {
			for (Movie m: movies) {
			out.println(m.getId() +"\t"+m.getTitle()+"\t"+m.getRating() +"\t"+m.getYear()+"\t"+m.getDirector());
			}
			out.close();
		} catch (IOException e) {
			success = false;
			e.printStackTrace();
		}
		// p.483 - note: this looks different than book example but works the same
		
		
		
		return success;
	}

	@Override
	public boolean update(Movie t) {
		// Not yet implemented
		return false;
	}

	@Override
	public boolean delete(Movie m) {
		// Not yet implemented
		movies.remove(m);
		return saveAll();
	}
	
	@Override
	public boolean upload() {
		boolean success = true;
		//read upload file
		try {
			BufferedReader in = new BufferedReader(
							  new FileReader(MOVIE_UPLOAD_FILE_NAME));
			String line = in.readLine();
			while (line != null) {
				//this is object mapping in core JAva!!!!
				String[] fields = line.split("\t");
				//after split we should have 5 fields per line
				String idStr = fields[0];
				int id = Integer.parseInt(idStr);
				String title = fields[1];
				String rating = fields[2];
				String yearStr = fields[3];
				int year = Integer.parseInt(yearStr);
				String director = fields[4];
				
				Movie m = new Movie(id, title, rating, year, director);
				movies.add(m);
				//get the next line in the file
				line = in.readLine();
			}
			in.close();
			}
			catch (Exception e){
				System.out.println("Error getting movie records from file.");
				e.printStackTrace();
				success = false;
			}
		
		//adding each new movie to movies list
		//save all records to the file
		if (success) {
			if (!saveAll()) {
				success = false;
			}
		}
		return success;
	}
}
