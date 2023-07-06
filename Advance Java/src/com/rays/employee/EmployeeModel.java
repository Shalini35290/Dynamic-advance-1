package com.rays.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {

	public EmployeeBean findById(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from employee where id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		EmployeeBean bean = null;

		while (rs.next()) {
			bean = new EmployeeBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setSalary(rs.getInt(3));
			bean.setAddress(rs.getString(4));
		}

		return bean;

	}

	public List search() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from employee");

		ResultSet rs = ps.executeQuery();

		ArrayList list = new ArrayList();

		while (rs.next()) {
			EmployeeBean bean = new EmployeeBean();

			bean.setId(rs.getInt(1));

			bean.setName(rs.getString(2));

			bean.setSalary(rs.getInt(3));

			bean.setAddress(rs.getString(4));

			list.add(bean);

		}
		return list;

	}

	public List search(EmployeeBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		StringBuffer sql = new StringBuffer("select * from Employee where 1=1 ");

		if (bean != null) {
			sql.append("and id =" + bean.getId());
			
		//System.out.println("sql :" + sql);
		}

		PreparedStatement ps = conn.prepareStatement(sql.toString());

		ResultSet rs = ps.executeQuery();

		ArrayList list = new ArrayList();
		while (rs.next()) {
			bean = new EmployeeBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setSalary(rs.getInt(3));
			bean.setAddress(rs.getString(4));
			
			list.add(bean);

		}
		return list;
		}
	
   }
    
	
			
		



