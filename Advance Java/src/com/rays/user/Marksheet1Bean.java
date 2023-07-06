package com.rays.user;

public class Marksheet1Bean {
	private int id;
	private int rollNo;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	private String pass;

	public void setId(int id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getPhysics() {
		return physics;

	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getMaths() {
		return maths;

	}

}
