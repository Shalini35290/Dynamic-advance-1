package com.rays.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource {
	
	private static JDBCDataSource jds = null;
	
	private ComboPooledDataSource ds = null;
	//Make Default Constructor Private
	private JDBCDataSource() {
		try {
		ds = new ComboPooledDataSource();
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/advance");
		ds.setUser("root");
		ds.setPassword("root");
		ds.setInitialPoolSize(5);
		ds.setAcquireIncrement(5);
		ds.setMaxPoolSize(25);
		} catch (Exception e) {
		e.printStackTrace();	
			
	}
}
	//get singleton class instance
	public static JDBCDataSource getInstance() {
		if(jds == null) {
			jds = new JDBCDataSource();
		}
		
		return jds;
		
	}
	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		}catch(SQLException e) {
			return null;
		}
		
	}
}
