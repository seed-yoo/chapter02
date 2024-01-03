package com.javaex.ex03;

public class Goods {

	// 필드
	private String name;
	private int price;
	
	// 생성자
	// 메소드 - getters / setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메소드-일반
	public void showInfo() {
		System.out.println("===========================================");
		System.out.println("상품명: " + name + ", 가격: " + price + "원");
		System.out.println("===========================================");
	}
	
}
