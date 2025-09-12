package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/your_database_name";
		String username = "username";
		String password = "password";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			if (con != null && !con.isClosed())
				System.out.println("Database Connected");
			else
				System.out.println("Failed to connect");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}