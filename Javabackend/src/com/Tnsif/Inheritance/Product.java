package com.Tnsif.Inheritance;

public class Product {
	int id;
	String name;
	double price;
	//constructor
	Product(int id,String name,double price){
		this.id= id;
		this.name=name;
		this.price=price;
	}
	//method
	void display() {
		System.out.printf("ID:"+ id + "Name: " + name + "Price: " + price);
	}

}
