package db;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserTextFile implements DAO<User> {
	private static final String USER_FILE_NAME = "users.txt";
	List<User> users = new ArrayList<>();
	
	
	
	public UserTextFile() {
		getAll();
	}


	@Override
	public User getById(int id) {
		for (User u: users) {
			if (id == u.getId()) {
				return u;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		if (users.size() == 0) {
			try {
			BufferedReader in = new BufferedReader(
								new FileReader(USER_FILE_NAME));
			//read products from file into arraylist
			String line = in.readLine();
			while (line != null) {
				String[] userData = line.split("\t");
				//assign all the stuff based on location
				String idStr = userData[0];
				int id = Integer.parseInt(idStr);
				String username = userData[1];
				String password = userData[2];
				String firstName = userData[3];
				String lastName = userData[4];
				String phoneNumber = userData[5];
				String email = userData[6];
				String reviewerStr = userData[7];
				boolean reviewer = (reviewerStr.equalsIgnoreCase("true"));
				String adminStr = userData[8];
				boolean admin = (adminStr.equalsIgnoreCase("true"));
				
				User u = new User(id, username, password, firstName, lastName, phoneNumber, 
									email, reviewer, admin);
				users.add(u);
				line = in.readLine();
			} 
			in.close();
			
			}
			catch (Exception e) {
				System.out.println(e);
				return null;
			}
		}
		return users;
	}

	@Override
	public boolean add(User u) {
		users.add(u);
		return saveAll();
	}

	@Override
	public boolean update(User u) {
		// TODO not yet implemented
		return false;
	}

	@Override
	public boolean delete(User u) {
		users.remove(u);
		return saveAll();
	}

	private boolean saveAll() {
		boolean success = true;
		Path usersPath = Paths.get(USER_FILE_NAME);
		File usersFile = usersPath.toFile();
		try (PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(usersFile)))) {
			for (User u: users) {
				//write to list
				out.print(u.getId() + "\t");
				out.print(u.getUsername() + "\t");
				out.print(u.getPassword() + "\t");
				out.print(u.getFirstName() + "\t");
				out.print(u.getLastName() + "\t");
				out.print(u.getPhoneNumber() + "\t");
				out.print(u.getEmail() + "\t");
				out.print(u.isReviewer() + "\t");
				out.println(u.isAdmin());
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			success = false;
			e.printStackTrace();
		}
		return success;
	}

}
