package com.rays.aj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCRUD {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into user values(4,'Jethalal',4000)");
		System.out.println("Data inserted :" + i);

	}

}
