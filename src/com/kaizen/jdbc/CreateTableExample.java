package com.kaizen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
	Connection connection = null;

	public CreateTableExample() {
		try {
			// Loading the driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection createConnection() {
		Connection con = null;
		if (connection != null) {
			System.out.println("connection");
		} else {
			try {
				// Crating a Connection to  database
				con = DriverManager.getConnection(
						"jdbc:mysql://10.0.2.2/test", "root","nyu2659");
				System.out.println("Connection created Successfully");
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		CreateTableExample jdbccOnnectionExample = new CreateTableExample();
		Connection conn = jdbccOnnectionExample.createConnection();
		// Creating a Statement reference variable
		Statement stmt = null;
		// getting the connection reference to the Statement
		// Creating a statement
		stmt = conn.createStatement();
		String queryString = "CREATE TABLE Student(RollNo int(9)  PRIMARY KEY NOT NULL, Name tinytext NOT NULL,Course varchar(25) NOT NULL, Address text  );";
		// Executing query
		stmt.executeUpdate(queryString);
		System.out.println("Table created successfully............");
		stmt.close();
		conn.close();
	}
}