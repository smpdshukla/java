package com.wieect;

public class Student extends Citizen {
	
	private int id;
	private String collegename; 
	//never repeat the same properties of the object
	private String branch;
	
	public void Study() {
		System.out.println("Student is studying for exam");
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Student() {
		super();
	}

	public Student(String name, String adharNo, long phNo, String gender, int id, String collegename, String branch) {
		super(name, adharNo, phNo, gender);
		this.id = id;
		this.collegename = collegename;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", collegename=" + collegename + ", branch=" + branch + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getphNo()=" + getphNo() + ", getGender()=" + getGender() + "]";
	}
}
