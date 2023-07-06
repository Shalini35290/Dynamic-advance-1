package com.rays.aj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCRUDMethodCalling {

	private static  void testDelete() throws Exception {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("delete from user where id=4");
		
		System.out.println("Data deleted :" + i);

		
	}

	private static void testUpdate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localHost:3306/advance","root","root");
		Statement stmt= conn.createStatement();
		int i= stmt.executeUpdate("update user set salary=10000 where id=3");
		System.out.println("Updated Data:" +i);
		
	}

	private static void testAdd() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into user values(4,'Jethalal',4000)");
		System.out.println("Data inserted :" + i);
		
	}

	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		  testDelete();
	}
}
