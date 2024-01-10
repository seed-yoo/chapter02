package com.javaex.ex22;

public class Ex03 {

	public static void main(String[] args) {
		
		Point p01 = new Point(2,2);
		p01.draw();
		
		Point p02;
		
		try {
			p02 = null; // new Point(100, 200);	// 다른곳에서 new 주소만 준다
			p02.draw();
			
		} catch (NullPointerException e) {
			System.out.println("p02(주소)값이 없습니다.");
		}
		
		System.out.println("종료");
		
	}
}
