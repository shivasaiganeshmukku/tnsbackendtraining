package com.Tnsif.Inheritance;

public class ShapeMain {

	public static void main(String[] args) {
		Shape c  = new CircleShape(5);
		Shape r  = new RectangleShape(4,6);
		Shape t  = new TriangleShape(3,8);
		
		c.area();
		r.area();
		t.area();
		
	}

}
