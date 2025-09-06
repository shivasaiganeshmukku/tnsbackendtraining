package com.Tnsif.Inheritance;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Electronic(101,"laptop",55000,2);
		Product p2 = new Clothing(102,"T-shirt",350,"L");
		Product p3 = new Book(103,"THE WINGS OF FIRE",799.0,"A.P.J.Abdulkalam");
		
		Product[] products = {p1,p2,p3};
		for (Product p: products) {
			p.display();
			System.out.println("----------------");
		}
		
	}

}
