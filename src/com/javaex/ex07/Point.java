package com.javaex.ex07;

public class Point {

	// 핃드
	private int x;
	private int y;

	// 생성자
	public Point() {
		// 메모리에 올리는일
		System.out.println("Point()");
	}

	public Point(int x) {
		// 메모리에 올리는일
		this.x = x;
		System.out.println("Point(int x)");
	}

//	public Point(int y) {		
//		// 메모리에 올리는일
//		this.y = y;
//	}
// 필드 변수가 int가 아닌 String 또는 int 외에 다른 변수이면 사용할 수 있다
	/*
	 * 예: public Point(String test) { // 메모리에 올리는일 this.test = test; // }
	 */

	public Point(int x, int y) {
		this(x);
		this.y = y;
		System.out.println("Point(int x, int y)");
	}

//	public Point(int x, int y) {
//		super();
//		this.x = x;
//		this.y = y;
//	}

	// 메소드 - getter/setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}

}
