package com.jdbc.ait;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/ait_23_01";
		String username="root";
		String password="root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(url,username,password);
			
//			System.out.println(connection);
			
//			if(connection!=null) {
//				System.out.println("Connection established successfully!");
//			}else {
//				System.out.println("Failed to establish connection.");
//			}
			
//			Statement statement = connection.createStatement();
//			
//			String query="create table first_jdbc(id int,name varchar(20));";
			
//			if(statement.execute(query)) {
//				System.out.println("Table created successfully!");
//			}else {
//				System.out.println("Failed to create table.");
//			}
			
//			int i = statement.executeUpdate(query);
			
//			System.out.println(i+" create table");
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
































