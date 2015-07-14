package mum.fpp.fm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class FMDataSource {
	
	public static Connection getConnection() {

		System.out.println("Connecting to database...");
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/fitness_monitor", "root", "");
			System.out.println("Conected!");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return conn;
	}

}
