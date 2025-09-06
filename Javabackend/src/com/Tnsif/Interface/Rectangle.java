package com.Tnsif.Interface;
//class for rectangle for shape interface
public class Rectangle  implements Shape{
	 double length;
	 double breath;
	 //constructor
	Rectangle(double length,double breath){
		this.length = length;
		this.breath = breath;
	}

	@Override
	public double area() {
		
		return length * breath;
	}

	@Override
	public double perimater() {
		
		return 2*(length+breath);
	}
	
	
	

}
