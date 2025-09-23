package com.Tnsif.Polymorphism;
//Demo for the overloading.
public class CalculatorMain {

	public static void main(String[] args) {
		
		
		Calculator c = new Calculator();
		System.out.println("multplication of two intigers" + c.mul(5, 9));
		System.out.println("mul of three numbers" + c.mul(3, 3,3));
		System.out.println("mul of double" + c.mul(3, 4));
	}

}
