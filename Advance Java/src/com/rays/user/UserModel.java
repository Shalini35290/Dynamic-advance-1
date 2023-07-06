package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UserModel {

	public void add(UserBean ub) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?)");

		ps.setInt(1, ub.getId());
		ps.setString(2, ub.getName());
		ps.setInt(3, ub.getSalary());

		int i = ps.executeUpdate();
		System.out.println("inserted " + i);

	}

	public static void testUpdate(UserBean bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("UPDATE USER SET NAME = ?, SALARY = ? WHERE ID = ?");
		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getSalary());
		ps.setInt(3, bean.getId());
		
		int i = ps.executeUpdate();
		System.out.println("Data UPDATED :" + i);

	}

	public static void delete(UserBean bean) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("DELETE FROM USER WHERE ID = ?");
		ps.setInt(1, bean.getId());
		
		
		int i = ps.executeUpdate();
		System.out.println("Data DELETED :" + i);
	}
}
