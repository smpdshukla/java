//to demonstrate encapsulation 
package com.wiect.sam;

public class Student{
	//entity class
	private String name;
	private int id;
	private int age;

	
	
	
	
		public Student(String name, int id, int age) {
		this();
		this.name = name;
		this.id = id;
		this.age = age;
	}





		public Student() {
	
		this.name = "Hityama";
		this.id = 25;
		this.age = 21;
	}





		@Override//object class method
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

}
