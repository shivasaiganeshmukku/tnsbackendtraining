package com.Tnsif.Inheritance;
//hierarchical inheritance
public class TriangleShape extends Shape {
	double base,height;
	//method
	TriangleShape(double b,double h){
		base = b;
		height= h;
	}
	@Override
	void area() {
		double result = 0.5*base*height;
		System.out.println("Area of Triangle: " + result);
	}
	

}
