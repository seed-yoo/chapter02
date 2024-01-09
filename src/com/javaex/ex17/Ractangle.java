package com.javaex.ex17;

public class Ractangle {

	// 필드
	private int width;
	private int height;
	private String lineColor;
	private String fillColor;

	// 생성자
	public Ractangle() {
		super();
		// 메모리에 올리는일
	}

	public Ractangle(int width, int height, String lineColor, String fillColor) {
		super();
		// 메모리에 올리는일
		this.width = width;
		this.height = height;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}

	// 메소드 - getter/setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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
		return "Ractangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	public void draw() {
		System.out.println("==============사각형을 그렸습니다====================");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("================================================");
	}

}
