package com.javaex.ex17;

public class Circle {

	// 필드
	private double radius;
	private String lineColor;
	private String fillColor;

	// 생성자
	public Circle() {
		super();
	}

	public Circle(double radius, String lineColor, String fillColor) {
		super();
		this.radius = radius;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	// 메소드 - getter/setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}

	public void draw() {
		System.out.println("==============원을 그렸습니다======================");
		System.out.println("반지름: " + radius);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("================================================");
	}

}
