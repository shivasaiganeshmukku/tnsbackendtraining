package com.Tnsif.Encapsulation;

public class Student {
	private int sid;
	private String name;
	
	public Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	//getter and setter for int
	public int getSid() {
		return sid;
		
	}
	public void setSid(int sid) {
		this.sid= sid;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println("The student details: " + sid + "Name: " +  name);
	}
}
