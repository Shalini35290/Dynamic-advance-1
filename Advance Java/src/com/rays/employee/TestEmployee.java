package com.rays.employee;

import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) throws Exception {
		//testFindById();
		//testSearch();
		testSearch1();
		}

	private static void testSearch1() throws Exception {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(1);
		EmployeeModel model = new EmployeeModel();
		List list = model.search(null);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			bean = (EmployeeBean)it.next();
			System.out.print(bean.getId());
			System.out.print("\t"+bean.getName());
			System.out.print("\t"+bean.getSalary());
		System.out.println("\t"+bean.getAddress());
		}
		
		
		
	}

	private static void testSearch() throws Exception {
		EmployeeModel model = new EmployeeModel();
	     List list = model.search();
	   Iterator it =  list.iterator();
	   while(it.hasNext()) {
       // System.out.println(it.next());
        EmployeeBean bean = (EmployeeBean)it.next();
	    System.out.println(bean.getId());
	    System.out.println(bean.getName());
	    System.out.println(bean.getSalary());
	    System.out.println(bean.getAddress());
	   }
		
	}

	private static void testFindById() throws Exception {
		
		EmployeeModel model = new EmployeeModel();
		EmployeeBean bean = model.findById(1);
		if(bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getName());
			System.out.println(bean.getSalary());
			System.out.println(bean.getAddress());
			
		} else {
			System.out.println("Id does not exist");
		}
		
		
		
	}
	
}
