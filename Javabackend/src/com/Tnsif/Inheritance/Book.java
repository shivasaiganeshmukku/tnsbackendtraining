package com.Tnsif.Inheritance;

public class Book extends Product {
	String Author;
	
	//constructor
	Book(int id,String name,double price,String Author){
		super(id,name,price);
		this.Author=Author;
		
	}
	@Override
	void display() {
		super.display();
		System.out.println("Author :" + Author);
	}

}
