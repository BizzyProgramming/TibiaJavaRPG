package bbrown2025;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TibiaAccountManager {
	private dataBase con;

	public TibiaAccountManager() {
		con = new dataBase();
	}

	public boolean login(String username, String password) {
		String sql = "SELECT id FROM users WHERE username = ? AND password = ?";
		try (PreparedStatement ps = con.getConnection().prepareStatement(sql)) {
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean register(String username, String password, String email) {
		String sql = "INSERT INTO users (name, password, email, creation) VALUES (?, ?, ?, NOW())";
		try (PreparedStatement ps = con.getConnection().prepareStatement(sql)) {
			ps.setString(1, username);
			ps.setString(2,  password);
			ps.setString(3, email);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		 
	}
}
