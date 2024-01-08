package com.javaex.ex16;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(4,4);
		Point p02 = new Point(40,400);
		
		p01.draw();
		p02.draw();
		
		ColorPoint c01 = new ColorPoint();
		// "Point()" --> "ColorPoint()"
		c01.setX(5);
		c01.setY(7);
		c01.setColor("노랑");
		
		c01.draw();
		
		ColorPoint c02 = new ColorPoint(3, 4, "Blue");
		c02.draw();
	}

}
