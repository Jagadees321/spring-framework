package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnimalCRUD {
	public static boolean saveAnimal(String name, int legs, int life) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_002","root","Jaggu@123");
			PreparedStatement ps=connection.prepareStatement("INSERT INTO animal VALUES(?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, legs);
			ps.setInt(3, life);
			ps.execute();
			connection.close();
			
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static ResultSet getAnimal() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_002","root","Jaggu@123");
			Statement st=con.createStatement();
			String sql= "select * from animal";
			return st.executeQuery(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}


