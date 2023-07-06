package com.rays.user;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet1 {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// testSearch();
		testFindByRollNo();

	}

	private static void testFindByRollNo() throws Exception {

		Marksheet1Model model = new Marksheet1Model();
		Marksheet1Bean bean = model.findByRollNo(102);

		if (bean != null) {

			System.out.println(bean.getId());
        	//System.out.println(bean.getRollNo());
//			System.out.println(bean.getName());
//			System.out.println(bean.getPhysics());
//			System.out.println(bean.getChemistry());
//			System.out.println(bean.getMaths());
//		System.out.println(bean.getPass());

		} else {
			System.out.println("Roll no. does not exist ");
		}

	}

	private static void testSearch() throws Exception {
		Marksheet1Model model = new Marksheet1Model();
		List list = model.search();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
			Marksheet1Bean bean = (Marksheet1Bean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.print("\t" + bean.getMaths());
			System.out.print("\t" + bean.getPass());
		}

	}

	private static void testAdd() throws Exception {
		Marksheet1Bean bean = new Marksheet1Bean();
		bean.setId(95);
		bean.setRollNo(100);
		bean.setName("rrr");
		bean.setPhysics(97);
		bean.setChemistry(98);
		bean.setMaths(96);
		bean.setPass("pass");

		Marksheet1Model model = new Marksheet1Model();
		model.add(bean);

	}

}
