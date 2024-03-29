package com.javaex.ex18;

public class Circle extends Shape {

	// 필드
	private int radius;

	// 생성자
	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(String lineColor, String fillColor , int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
		
		/*
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		this.width = width;
		this.height = height;
		*/
	}

	// 메소드 - getter/setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getLineColor()=" + getLineColor() + ", getFillColor()=" + getFillColor()
		+ "]";
	}
	
	public void draw() {
		System.out.println("==============원을 그렸습니다======================");
		System.out.println("가로: " + radius);
		System.out.println("면색: " + getFillColor());
		System.out.println("선색: " + getLineColor());
		System.out.println("================================================");
	}

	
	
}
