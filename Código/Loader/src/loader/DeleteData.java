package loader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
	private final static String name = "postgres";
	private final static String password = "postgres";
	private final static String url = "jdbc:postgresql://localhost/is_database";

	public static void main(String[] args) throws SQLException {
		Connection conn = (Connection) DriverManager.getConnection(url, name, password);
		Statement stmt = (Statement) conn.createStatement();
		// Create tables. Works if ran twice
		String sql;
		

		// Add researchers and publications 5, works if run twice
		sql = "DROP TABLE IF EXISTS researchers_publications;";
		stmt.executeUpdate(sql);
		
		sql = "DROP TABLE IF EXISTS researchers_skillsandexpertise;";
		stmt.executeUpdate(sql);
		
		sql = "DROP TABLE IF EXISTS skillsandexpertise;";
		stmt.executeUpdate(sql);
		
		sql = "DROP TABLE IF EXISTS publications;";
		stmt.executeUpdate(sql);
		
		sql = "DROP TABLE IF EXISTS researchers;";
		stmt.executeUpdate(sql);
		
		sql = "DROP TABLE IF EXISTS institutions;";
		stmt.executeUpdate(sql);

		System.out.println("\nALL DATA DELETED\n");
	}
}