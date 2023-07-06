package com.rays.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rays.employee.EmployeeBean;

public class TestJDBC {
	public static void main(String[] args) throws Exception {
		for (int i = 1; i < 25; i++) {
			System.out.println("connection :" + i);
			testDCP();

			System.out.println("============================================");
		}

	}

	private static void testDCP() throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from employee where id = 1");
		ResultSet rs = ps.executeQuery();
		EmployeeBean bean = null;

		while (rs.next()) {
			bean = new EmployeeBean();
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getInt(3));
			System.out.println(rs.getString(4));

		}

	}
}
