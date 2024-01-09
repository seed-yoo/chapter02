package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArray = new Shape[2];
		Ractangle[] rArray = new Ractangle[2];
		Triangle[] tArray = new Triangle[2];
		Circle[] cArray = new Circle[2];
		
		// 도형(부모)
		Shape s01 = new Shape();
		s01.setFillColor("흰색");
		s01.setLineColor("주황");
		Shape s02 = new Shape("주황", "빨강");
//		System.out.println(s01.toString());
//		System.out.println(s02.toString());
		
		// 사각형(자식)
		Ractangle r01 = new Ractangle("흑색","흰색", 100, 101);
		Ractangle r02 = new Ractangle("빨강","주황", 10, 15);
//		System.out.println(r01.toString());
//		System.out.println(r02.toString());
		
		// 삼각형(자식)
		Triangle t01 = new Triangle("흑색","흰색", 100, 101);
		Triangle t02 = new Triangle("빨강","주황", 10, 15);
//		System.out.println(t01.toString());
//		System.out.println(t02.toString());
		
		// 원형(자식)
		Circle c01 = new Circle("흑색","흰색", 5);
		Circle c02 = new Circle("빨강","주황", 5);
//		System.out.println(c01.toString());
//		System.out.println(c02.toString());
		
		
		sArray[0] = s01;
		sArray[1] = s02;
		
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].toString());
		}
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for (int i = 0; i < rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		
		tArray[0] = t01;
		tArray[1] = t02;
		
		for (int i = 0; i < tArray.length; i++) {
			System.out.println(tArray[i].toString());
		}
		
		cArray[0] = c01;
		cArray[1] = c02;
		
		for (int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i].toString());
		}
		
		
		
	}
}
