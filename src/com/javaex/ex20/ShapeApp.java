package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Ractangle r01 = new Ractangle("흰", "검은", 2, 4);
		System.out.println(r01.getWidth());
		*/
		
		Shape[] sArray = new Shape[3];
		
		// 부모만 보인다. ※자식쪽은 사용 못함
		Shape s01 = new Ractangle("빨강", "주황", 7, 25);	// 사각형
		Shape s02 = new Triangle("노랑", "초록", 9, 12);	// 삼각형
		Shape s03 = new Circle("파랑", "남색", 2);		// 원
		
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		
		// 사각형의 가로값 가져오기
		((Ractangle)sArray[0]).getWidth();
		System.out.println(((Ractangle)sArray[0]).getWidth());
		
		// 삼각형의 가로값 가져오기
		((Triangle)sArray[1]).getWidth();
		System.out.println(((Triangle)sArray[1]).getWidth());
		
		// 원의 반지름
		((Circle)sArray[2]).getRadius();
		System.out.println(((Circle)sArray[2]).getRadius());
		
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
	}
}
