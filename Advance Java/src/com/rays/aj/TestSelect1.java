package com.rays.aj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from user where id=1");
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" +rs.getString(2));
			System.out.println("\t" +rs.getInt(3));
			
			
			
		}
		
		
	}

}
