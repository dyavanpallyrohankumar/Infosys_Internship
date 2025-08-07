package exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLexception {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fakedb", "Wrong", "a,krjbgd");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT FROM TABLE");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}