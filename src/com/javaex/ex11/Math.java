package com.javaex.ex11;

public class Math {

	// 필드
	
	// 생성자

	// 메소드 - getter/setter

	// 메소드 - 일반
	public int plus(int a, int b) {
		int sum = a + b; // 복잡한식
		return sum;
	}

	public double plus(double a, int b) {
		double sum = a + b;
		return sum;
	}

	public double plus(int a, double b) {
		double sum = a + b;
		return sum;
	}

	public double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}

	public String plus(String a, int b) {
		String sum = a;
		for (int i = 1; i < b; i++) {
			sum = sum + a;
		}
		return sum;
	}

	public String plus(int a, String b) {
		String sum = b;
		for (int i = 1; i < a; i++) {
			sum = sum + b;
		}
		return sum;
	}
}
