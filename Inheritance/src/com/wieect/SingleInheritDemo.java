package com.wieect;

public class SingleInheritDemo {

	public static void main(String[] args) {
		Student s1 = new Student("Sampada","1234 4567 78901",234556,"Female",10,"Watumull","CS");
		System.out.println(s1);
		s1.Study();
		s1.payTax();

	}

}
