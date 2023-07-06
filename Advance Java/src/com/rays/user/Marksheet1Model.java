package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Marksheet1Model {

	public void add(Marksheet1Bean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into marksheet1 values(?,?,?,?,?,?,?)");

		ps.setInt(1, bean.getId());
		ps.setInt(2, bean.getRollNo());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());
		ps.setString(7, bean.getPass());

		int i = ps.executeUpdate();
		System.out.println("Data Inserted = " + i);

	}

	public List search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from marksheet1");

		ResultSet rs = ps.executeQuery();

		ArrayList list = new ArrayList();

		while (rs.next()) {

			Marksheet1Bean bean = new Marksheet1Bean();

			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getInt(2));
			bean.setName(rs.getString(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			bean.setPass(rs.getString(7));
			list.add(bean);
		}

		return list;

	}

	public Integer nextPk() throws Exception {
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select max(id) from Marksheet1");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
		}
		return pk + 1;

	}

	public Marksheet1Bean findByRollNo(int rollNo) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");
		PreparedStatement ps = conn.prepareStatement("select * from marksheet1 where roll_no = ?");
		ps.setInt(1, rollNo);
		ResultSet rs = ps.executeQuery();
		Marksheet1Bean bean = null;

		while (rs.next()) {

			bean = new Marksheet1Bean();
			bean.setId(rs.getInt(1));
			

		}

		return bean;

	}

}
