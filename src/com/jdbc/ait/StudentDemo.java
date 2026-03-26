package com.jdbc.ait;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDemo {

	static String url="jdbc:mysql://localhost:3306/ait_23_01";
	static String username="root";
	static String password="root";

	static Scanner sc= new Scanner(System.in);

	static Connection con ;


	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con= DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Connect done...");
	}

	public static void main(String[] args) throws SQLException {

		//1.create Table\t 2.Add Student\t 3.Update Student\t 4.Delete student\t 5.Search Student

		while(true) {
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();


			switch(ch) {

			case 1:
				createTable();
				break;

			case 2: 
				int rows=addStudent();
				System.out.println(rows+" inserted...");
				break;
				
			case 3:
				removeStudent();
				System.out.println("Student removed...");
				break;
				
			default:
				System.out.println("Invalid choice....try again");

			}

		}

	}

	private static void removeStudent() {
		// TODO Auto-generated method stub
		
	}

	private static void createTable() throws SQLException {
		String sql="create table student(sno int,name varchar(20));";
		Statement statement = con.createStatement();

		boolean ex = statement.execute(sql);

		System.out.println("Tables created....!!"+ex);

	}

	private static int addStudent() throws SQLException {
		String sql="insert into student values(?,?);";
		PreparedStatement pms = con.prepareStatement(sql);

		System.out.println("Enter sno: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		String name=sc.nextLine();

		pms.setInt(1, id);
		pms.setString(2, name);

		return pms.executeUpdate();

	}

}



























