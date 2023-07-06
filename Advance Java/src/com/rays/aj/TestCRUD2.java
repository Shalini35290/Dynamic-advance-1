package com.rays.aj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCRUD2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localHost:3306/advance","root","root");
		Statement stmt= conn.createStatement();
		int i= stmt.executeUpdate("update user set salary=10000 where id=3");
		System.out.println("Updated Data:" +i);
		
		
	}

}
