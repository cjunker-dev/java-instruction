package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import business.User;

public class UserDB implements DAO<User> {
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs";
		String userName = "prs_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, userName, password);
		return conn;
	}

	@Override
	public User getById(int id) {
		User u = null;
		String sql = "select * from user where id = ?";
		
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);){
			ps.setInt(1, id);			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u = getUserFromResultSet(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with finding user by id.");
			e.printStackTrace();
		}
		return u;
		}

	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String username = rs.getString(2);
		String password = rs.getString(3);
		String firstName = rs.getString(4);
		String lastName = rs.getString(5);
		String phone = rs.getString(6);
		String email = rs.getString(7);
		boolean isReviewer = rs.getBoolean(8);
		boolean isAdmin = rs.getBoolean(9);
		User u = new User(id, username, password, firstName, lastName, 
				phone, email, isReviewer, isAdmin);
		return u;
	}

	@Override
	public List<User> getAll() {
		List<User> user = new ArrayList<>();
		String sql = "select * from user;";
		try (Connection conn = getConnection();
				 Statement stmt = conn.createStatement();
				 ResultSet rs = stmt.executeQuery(sql)) {
				// p 681 - processing result set
				while (rs.next()) {
					User u = getUserFromResultSet(rs);
					user.add(u);
				}
			} catch (SQLException e) {
				System.err.println("Error getting all users.");
				e.printStackTrace();
			}
			
			return user;
	}

	@Override
	public boolean add(User u) {
		boolean success = false;
		//never declare the id when adding - it is autogenerated
		String sql = "insert into user (username, password, firstName, lastName, "
				+ "						phoneNumber, email, isReviewer, isAdmin) "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4, u.getLastName());
			ps.setString(5, u.getPhoneNumber());
			ps.setString(6, u.getEmail());
			ps.setBoolean(7, u.isReviewer());
			ps.setBoolean(8, u.isAdmin());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error adding actor.");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(User u) {
		return false;
	// TODO
	}

	@Override
	public boolean delete(User u) {
		boolean success = false;
		//p 691
		String sql = "delete from user where id = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, u.getId());
				ps.executeUpdate();
				success = true;
			} catch (SQLException e) {
				System.out.println("Error deleting user.");
				e.printStackTrace();
			}
		
		return success;
	}
	
}
