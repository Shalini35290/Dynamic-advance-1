package com.rays.test;

import java.util.ResourceBundle;

public class TestApp {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");
		System.out.println(rb.getString("driver"));
		System.out.println(rb.getString("url"));
	}

}
