package mum.fpp.fm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FMDataSource {
	
	public static Connection getConnection() {

		System.out.println("Connecting to database...");
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return conn;
	}

	public static void main(String[] args) {
		// First we set up the BasicDataSource.
		// Normally this would be handled auto-magically by
		// an external configuration, but in this example we'll
		// do it manually.
		//
		System.out.println("Setting up data source.");
		System.out.println("Done.");

		//
		// Now, we can use JDBC DataSource as we normally would.
		//
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			System.out.println("Creating connection.");
			conn = getConnection();
			System.out.println("Creating statement.");
			stmt = conn.createStatement();
			System.out.println("Executing statement.");
			rset = stmt.executeQuery("Select * from fm_records");
			System.out.println("Results:");
			int numcols = rset.getMetaData().getColumnCount();
			while (rset.next()) {
				for (int i = 1; i <= numcols; i++) {
					System.out.print("\t" + rset.getString(i));
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null)
					rset.close();
			} catch (Exception e) {
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}


}
