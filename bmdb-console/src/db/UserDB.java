package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import business.Movie;
import business.User;

public class UserDB {
	// p 677 - all CRUD methods will use this to connect to DB
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String userName = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, userName, password);
		return conn;
	}

	public User login(String un, String pwd) {
		//note: poor design... won't be able to differentiate 
		//between exception and invalid login
		User u = null;
		String sql = "select * from user " + "where username = ?" + " and password = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			// p 685
			ps.setString(1, un);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u = getUserFromResultSet(rs);
			}

		} catch (SQLException e) {
			System.err.println("Error getting user by id.");
			e.printStackTrace();
		}
		return u;
	}

	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String un = rs.getString(2);
		String pw = rs.getString(3);
		String firstName = rs.getString(4);
		String lastName = rs.getString(5);
		String phoneNumber = rs.getString(6);
		String email = rs.getString(7);
		double collectionValue = rs.getDouble(8);
		User u = new User(id, un, pw, firstName, lastName, phoneNumber, email, collectionValue);
		return u;
	}

}
