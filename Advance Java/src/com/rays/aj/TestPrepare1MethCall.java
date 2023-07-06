package com.rays.aj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrepare1MethCall {
	public static void main(String[] args) throws Exception {
		testAdd(5,"gg",500);
		
	}

	private static void testAdd(int id, String name, int salary) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
	PreparedStatement ps= conn.prepareStatement("insert into user values (? ,?, ?)");
	ps.setInt(1,id);
    ps.setString(2,name);
    ps.setInt(3,salary);
    int i= ps.executeUpdate();
    System.out.println("Data Inserted :" +i);
    
		
		
	}

	
		
	}


