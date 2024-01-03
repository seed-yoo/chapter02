package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point num = new Point();
		Point num2 = new Point();
		
		num.setX(5);
		num.setY(5);
		
		num2.setX(10);
		num2.setY(23);
		
//		System.out.println("점[x="+ num.getX() + "], [y=" + num.getY() + "]을 그렸습니다.");
//		System.out.println("점[x="+ num2.getX() + "], [y=" + num2.getY() + "]을 그렸습니다.");
		
		num.draw();
		num2.draw();
		
	}

}
