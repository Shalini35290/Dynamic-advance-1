package com.rays.aj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCRUD1 {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("delete from user where id=4");
		
		System.out.println("Data deleted :" + i);

	}
}
