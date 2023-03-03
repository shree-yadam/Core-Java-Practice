package com.shree.apexjavalearning.database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sampleDatabaseConnection {
	public static void getDatabaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionString = "jdbc:mysql://localhost:3306/Person";
			String username = "root";
			String password = "amie2812";
			Connection con = DriverManager.getConnection(connectionString, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");
			while (rs.next()) {
				User user = new User(rs.getInt("id"), rs.getString("name"), 
						rs.getInt("age"), rs.getString("email"));
				System.out.println(user);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getDatabaseConnection();
	}

}
