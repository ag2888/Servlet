package com.kaizen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteBatchExample {
	Connection connection = null;
	static int roll;

	public ExecuteBatchExample() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

	public Connection getConnection() throws SQLException {
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "admin");

		return connection;
	}

	public static void main(String[] args) throws Exception {
		ExecuteBatchExample updateableResultSet = new ExecuteBatchExample();
		Connection conn = updateableResultSet.getConnection();
		Statement statement = conn.createStatement(
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		conn.setAutoCommit(false);
		String updateQuery1 = "INSERT INTO student VALUES(12,'Raman','B.Tech','Betiah')";
		statement.addBatch(updateQuery1);
		String updateQuery2 = "INSERT INTO student VALUES(13,'Kanhaiya','M.Tech','Delhi')";
		statement.addBatch(updateQuery2);
		String updateQuery3 = "INSERT INTO student VALUES(14,'Tinkoo','MBA','Alligarh')";
		statement.addBatch(updateQuery3);
		String updateQuery4 = "INSERT INTO student VALUES(11,'Pawan','BBA','Darbhanga')";
		statement.addBatch(updateQuery4);
		statement.executeBatch();
		String query = "SELECT * FROM student";
		ResultSet rs = statement.executeQuery(query);
		conn.commit();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":"
					+ rs.getString(3) + ":" + rs.getString(4));
		}
		rs.close();
		statement.close();
		conn.close();
	}
}