package com.kaizen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {
	public static void main(String[] args) throws SQLException {
		Connection con = null; // connection reference variable for getting
								// connection
		Statement stmt = null; // Statement reference variable for query
								// Execution
		String conUrl = "jdbc:mysql:localhost:3306/";
		String driverName = "com.mysql.jdbc.Driver";
		String databaseName = "test";
		String usrName = "root";
		String usrPass = "nyu2659";
		try {
			// Loading Driver
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		try {
			// Getting Connection
			con = DriverManager.getConnection(conUrl + databaseName, usrName,
					usrPass);
			// Creating Statement for query execution
			stmt = con.createStatement();
			// creating Query String
			String query = "INSERT INTO student values(1,'David','Java Training','NJ')";
			// Updating Table
			stmt.executeUpdate(query);
			System.out.println("Table Updated Successfully....");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			// Closing Connection
			con.close();
			stmt.close();
		}
	}
}