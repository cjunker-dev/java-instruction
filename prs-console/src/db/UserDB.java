package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import business.User;

public class UserDB implements DAO<User> {
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prsdb";
		String userName = "prs_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, userName, password);
		return conn;
	}

	@Override
	public User getById(int id) {
		User u = null;
		String sql = "select * from user where id = ?";
		
		
		
		
		
		return u;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User u) {
		// TODO Auto-generated method stub
		return false;
	}
}
