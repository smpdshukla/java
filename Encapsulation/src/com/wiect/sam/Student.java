//to demonstrate encapsulation 
package com.wiect.sam;

public class Student{
	//entity class
	private String name;
	private int id;
	private int age;

	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String n) {
		//reference method in java		
		name = n;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override//object class method
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

}
