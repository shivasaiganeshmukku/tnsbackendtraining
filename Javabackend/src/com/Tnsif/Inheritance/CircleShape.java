package com.Tnsif.Inheritance;
// hierarchical inheritance
public class CircleShape extends Shape {
	double radious;
	
	CircleShape(double r){
		radious = r;
	}
	@Override
	void area() {
		double result = Math.PI*radious *radious;
		System.out.println("Area of circle:" + result);
	}

}
