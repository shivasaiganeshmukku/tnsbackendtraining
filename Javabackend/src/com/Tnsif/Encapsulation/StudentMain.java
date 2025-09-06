package com.Tnsif.Encapsulation;

public class StudentMain {
	public static void main(String []args) {
		Student st= new Student(1001,"sai");
		st.setSid(1001);
		st.setname("Shiva");
		System.out.println(st.getSid());
		System.out.println(st.getname());
		st.display();
	}
}
