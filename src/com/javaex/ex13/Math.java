package com.javaex.ex13;

public class Math {

	// 필드
	private static final double pi = 3.14; 
	// 생성자
	// 디폴트 생성자 사용

	// 메소드 - getter/setter

	// 메소드 - 일반
	public static int plus(int a, int b) {
		int sum = a+b;
		return sum;
	}

	public static double plus(double a, int b) {
		double sum = a+b;
		return sum;
	}

	public static double plus(int a, double b) {
		double sum = a+b;
		return sum;
	}

	public static double plus(double a, double b) {
		double sum = a+b;
		return sum;
	}
	
	public static double circleArea(double radius) {
		double area = pi*radius*radius;
		return area;
	}
	

}
