package com.Tnsif.Inheritance;

public class Clothing extends Product {

	String size;
	
	Clothing(int id,String name,double price,String size){
		super(id,name,price);
		this.size=size;
	}
	void display() {
		super.display();
		System.out.println("Size:" + size);
	}
	

}
