package com.jdbc.ait;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepStatDemo {

	//CRUD 
	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/ait_23_01";
		String username="root";
		String password="root";
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
//			String query="insert into first_jdbc values(?,?);";
			
//			String query="select * from first_jdbc;";
			
//			String query="update first_jdbc set name=? where id=?";
			
			String query ="delete from first_jdbc where id=?";
			
			PreparedStatement pms = connection.prepareStatement(query);
			
//			System.out.println("Enter id: ");
//			int id=sc.nextInt();
//			sc.nextLine();
//			System.out.println("Enter name: ");
//			String name=sc.nextLine();
//			
//			pms.setInt(1, id);
//			pms.setString(2, name);
//			
//			int rows=pms.executeUpdate();
//			
//			if(rows>0) {
//				System.out.println(rows+" is affected..");
//			}
			
//			ResultSet res = pms.executeQuery();
			
//			System.out.println(res);
			
//			while(res.next()) {
//				System.out.println("ID: "+res.getInt(1)+" Name: "+res.getString(2));
//			}
			
			System.out.println("Enter id: ");
			int id=sc.nextInt();
//			sc.nextLine();
//			System.out.println("Enter name: ");
//			String name=sc.nextLine();
			
			pms.setInt(1, id);
//			pms.setString(1, name);
			
			int rows = pms.executeUpdate();
			System.out.println(rows+" affected..");
			
			connection.close();
			sc.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
