package com.Tnsif.Inheritance;
//hierarchical inheritance
public class RectangleShape extends Shape {
	
	double length,width;
	//method
	RectangleShape(double l,double w){
		length = l;
		width = w;
	
	}
	@Override
	void area() {
		double result = length*width;
		System.out.println("Area of Rectangle:"+ result);
	}

}
