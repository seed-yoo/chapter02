package com.javaex.ex19;

public class Shape {

	// 필드
	private String lineColor;
	protected String fillColor;
	
	// 생성자
	public Shape() {
		super();
	}

	public Shape(String lineColor, String fillColor) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	// 메소드 - getter/setter
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
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	public void draw() {
		// 모양을 시각화 하는 복잡한 로직작품
//		System.out.println("==============모양을 그렸습니다====================");
//		System.out.println("면색: " + fillColor);
//		System.out.println("선색: " + lineColor);
//		System.out.println("================================================");
		System.out.println("Shape.draw()");
	}
	
	
}
