package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		// Drawable 배열만들기
		Drawable[] dArray = new Drawable[4];
		
		// 그릴 수 있는애 Drawable
		Drawable d01 = new Ractangle("블랙", "화이트", 1, 201);	// 사각형
		Drawable d02 = new Triangle("노랑", "초록", 9, 12);		// 삼각형
		Drawable d03 = new Circle("파랑", "남색", 2);				// 원
		Drawable d04 = new Point(91, 67);						// 점
		
		// 배열에 주소넣기
		dArray[0] = d01;	// 사각형
		dArray[1] = d02;	// 삼각형
		dArray[2] = d03;	// 원
		dArray[3] = d04;	// 점
		
		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		
		// 사각형의 가로
		System.out.println( ((Ractangle)dArray[0]).getWidth() );
		
		// 삼각형의 넓이
		System.out.println( ((Triangle)dArray[1]).area() );
		
		// 원의 넓이
		System.out.println( ((Circle)dArray[2]).area() );
		System.out.println( ((Shape)dArray[2]).area() );
		
		// 점의 y값
		System.out.println( ((Point)dArray[3]).getY() );
		
		System.out.println("===================================");
		// 전체에서 도형의 넓이를 출력
		for (int i = 0; i < dArray.length; i++) {
			
			if(dArray[i] instanceof Shape) {
				// 현재 배열의 방(주소)를 따라가면 Shape 이 있으면
				System.out.println( ((Shape)dArray[i]).area() );
			}else if(dArray[i] instanceof Drawable) {
				((Drawable)dArray[i]).draw();
			}
				
				
		}
		
//		d01.draw();
//		d02.draw();
//		d03.draw();
//		d04.draw();
		
		
	}
}
