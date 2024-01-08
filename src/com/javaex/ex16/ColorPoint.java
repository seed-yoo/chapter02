package com.javaex.ex16;

public class ColorPoint extends Point {

	// 필드
	private String color;

	// 생성자
	public ColorPoint() {
		super();
		System.out.println("ColorPoint()");
	}

	public ColorPoint(String color) {
		super();
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);		// 부모의 파라미터2개 있는 생성자 호출
		this.color = color;
		System.out.println("ColorPoint(3)");
	}
	
	/*
	public ColorPoint(int x, int y, String color) {
		super();		// 부모의 기본 생성자 호출
		setX(x);
		setY(y);
		this.color = color;
	}
	*/
	
	// 메소드 - getter/setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "x = " + getX() + ", y = " + getY() + ", color = " + color;
	}
	
	public void draw() {
		System.out.println("점 [x=" + getX() + ", y=" + getY() + ", 색= " + color + "]을/를 그렸습니다.");
	}

}
