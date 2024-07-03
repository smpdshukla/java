package com.sam.wiect;

public class Customer {
	private String name;
	private int customer_id;
	private String address;
	
	
	public Customer() { //This is a default constructor.
		super(); //calls parent class
		this.name = "Sampada";
		this.customer_id = 54;
		this.address = "Kalyan";
	}
	
	public Customer(String name,int customer_id,String address) { //This is a parameterised constructor.
		this(); //calls another constructor in same class explicitly.
		this.name = name; //property of object& parameter
		this.customer_id = customer_id;
		this.address = address;
		
	}
	
	

	@Override //object class method
	public String toString() {
		return "Customer [name=" + name + ", customer_id=" + customer_id + ", address=" + address + "]";
	}
	
		
	}




