package com.kaizen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
	Connection connection = null;

	public PreparedStatementExample() {
		try {
			// Loading the driver
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	public Connection createConnection() {
		Connection con = null;
		if (connection != null) {
			System.out.println("Cant create a connection");
		} else {
			try {
				// Crating a Connection to the Student database
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/test", "root","root");
				System.out.println("Connection created Successfully");
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		PreparedStatementExample jdbccOnnectionExample = new PreparedStatementExample();
		Connection conn = jdbccOnnectionExample.createConnection();
		PreparedStatement ptmt = null;
		// getting the connection reference to the Statement
		String queryString = "UPDATE student SET Name=? WHERE RollNo=?";
		ptmt = conn.prepareStatement(queryString);
		ptmt.setString(1, "John");
		ptmt.setInt(2, 2);
		ptmt.executeUpdate();
		System.out.println("Table Updated successfully Using prepared statement............");
		ptmt.close();
		conn.close();
	}
}