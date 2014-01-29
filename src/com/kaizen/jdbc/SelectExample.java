package com.kaizen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {
	public static void main(String[] args) throws SQLException {
		System.out.println("MySQL Select Example.");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 3306 is the default port number of MySQL
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		try {
			// Load the driver
			Class.forName(driver);
			// Get a connection
			conn = DriverManager
					.getConnection(url + dbName, userName, password);
			System.out.println("Connected to the database");
			// Create a Statement
			stmt = conn.createStatement();
			// Create a query String
			String query = "SELECT * FROM student";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("Roll No- " + rs.getInt("rollno")
						+ ", Student Name- " + rs.getString("name")
						+ ", Student Course " + rs.getString("course"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not found Exception cought");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Closing the connection
			conn.close();
			stmt.close();
			rs.close();
			System.out.println("Disconnected from database");
		}
	}
}