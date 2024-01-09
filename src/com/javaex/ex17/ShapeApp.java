package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle[] rArray = new Ractangle[3];
		Triangle[] tArray = new Triangle[3];
		Circle[] cArray = new Circle[3];
		
		Ractangle r01 = new Ractangle(5,10,"파랑","빨강");
		Ractangle r02 = new Ractangle(15,60,"초록","노랑");
		Ractangle r03 = new Ractangle(25,140,"보라","주황");
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		
		//////////////////////////////////////////////////
		// 삼각형
		Triangle t01 = new Triangle(5,10,"파랑","빨강");
		Triangle t02 = new Triangle(15,60,"초록","노랑");
		Triangle t03 = new Triangle(25,140,"보라","주황");
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
		
		//////////////////////////////////////////////////////
		// 원
		Circle c01 = new Circle(5,"파랑","빨강");
		Circle c02 = new Circle(15,"초록","노랑");
		Circle c03 = new Circle(25,"보라","주황");
		
		// 배열에 원(주소) 담기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		
		
		
	}
}
