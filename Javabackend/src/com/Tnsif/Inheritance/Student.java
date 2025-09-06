package com.Tnsif.Inheritance;

public class Student extends Person {
	String grade;
	//child constructor uses super() to call Parent constructor
	public  Student(String name,int age,String grade) {
		super(name,age);
		this.grade=grade;
		
	}
	//method
	void display() {
		// call parent class using super
		super.displayinfo();
		System.out.println("Grade:" + grade);
	}
	
}
