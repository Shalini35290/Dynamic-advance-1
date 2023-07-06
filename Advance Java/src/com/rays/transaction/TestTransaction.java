package com.rays.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestTransaction {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("insert into user values(6,'sonam',3000)");
		i = stmt.executeUpdate("insert into user values(2,'sonam',3000)");
		i = stmt.executeUpdate("insert into user values(4,'shruti',8000)");
		System.out.println("Data inserted :" + i);
		conn.commit();

	}

}
