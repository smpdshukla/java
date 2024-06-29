package com.wiect.emp;

public class Emp {
	private String name;
	private int id;
	private double salary;
	
	public String getName() {
		return name;
		}
	public void setName(String n) {
		name = n;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id = i;
	}
	
	public double getSal() {
		return salary;
	}
	
	public void setSal(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	

}
