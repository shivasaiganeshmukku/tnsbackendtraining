package com.Tnsif.Interface;
//class circle for interface of shape
public class Circle implements Shape{
	double radious;
	
	//constructor
	Circle(double radious){
		this.radious = radious;
	}

	@Override
	public double area() {
		
		return Math.PI*radious*radious;
	}

	@Override
	public double perimater() {
		
		return 2 *Math.PI*radious;
	}
	

}