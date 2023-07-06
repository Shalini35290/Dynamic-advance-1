package com.rays.util.pract;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rays.employee.EmployeeBean;

public class TestJDBC1 {
	public static void main(String[] args) throws Exception {
		for(int i = 0; i<25; i++) {
			System.out.println("connection :" +i);
			testDCP1();
			System.out.println("===========================");
		}
	}

	private static void testDCP1() throws Exception {
		Connection conn =JDBCDataSource1.getConnection();
	PreparedStatement ps = conn.prepareStatement("select * from employee");
	ResultSet rs = ps.executeQuery();
		EmployeeBean bean = null;
		while(rs.next()) {
			bean =new EmployeeBean();
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
		}
		
	}

}
