package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserBeanTest {

	public static void main(String[] args) throws Exception {
		
		//addInsert();
		addUpdate();
        // addDelete(); 
	}

	public static void addInsert() throws Exception {

		UserBean b = new UserBean();
		b.setId(88);
		b.setName("HHH");
		b.setSalary(444);

		UserModel um = new UserModel();
		um.add(b);

	}

	public static void addUpdate() throws Exception {

		UserBean b = new UserBean();
		b.setId(88);
		b.setName("KLKL");
		b.setSalary(999);

		UserModel um = new UserModel();
		um.testUpdate(b);

	}
	public static void addDelete() throws Exception {
		UserBean b= new UserBean();
		b.setId(2);
		 UserModel um = new UserModel();
		 um.delete(b);
		
	}
	

}
