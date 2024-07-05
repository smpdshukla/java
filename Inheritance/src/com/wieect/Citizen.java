package com.wieect;

public class Citizen {
	private String name;
	private String adharNo;
	private long phNo;
	private String gender;
	
	public void payTax() {
		System.out.println("Citizen paid the tax");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public long getphNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Citizen() {
		System.out.println("Default Const");
	}
	public Citizen(String name, String adharNo, long phNo, String gender) {
//		super();
		this.name = name;
		this.adharNo = adharNo;
		this.phNo = phNo;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", phNo=" + phNo + ", gender=" + gender + "]";
	}
  
}
