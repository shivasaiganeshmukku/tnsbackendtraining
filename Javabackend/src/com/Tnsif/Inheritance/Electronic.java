package com.Tnsif.Inheritance;

public class Electronic extends Product {
	int warranty;
	
	Electronic(int id,String name,double price,int warranty){
		super(id,name,price);//use super to call parent constructor
		this.warranty=warranty;
	}
	@Override
	void display() {
		super.display();
		System.out.println("Warranty : " + warranty + "years");
	}
}
