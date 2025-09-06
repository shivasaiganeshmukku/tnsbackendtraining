package com.Tnsif.Inheritance;

public class Person {
	String name;
	int age;
	// parent constructor
	Person(String name,int age){
		this.name=name;
		this.age = age;
		
	}
	void displayinfo() {
		System.out.println("Name: "+ name );
		System.out.println("Age: " + age);
	}

}
