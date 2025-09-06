package com.Tnsif.Interface;
//for interface using the main class 
public class ShapeMain {

	public static void main(String[] args) {
		Shape c= new  Circle(5);// radius 5
		Shape  r = new Rectangle(4,6);
		
		System.out.println("Area of circle: " + c.area());
		System.out.println("Area of perimater: " + c.perimater());
		System.out.println("Area of Rectangle: " + r.area());
		System.out.println("Perimater of rectangle: " + r.perimater());
	}

}
