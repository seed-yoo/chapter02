package com.javaex.ex06;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() {
		// 메모리에 올리는 일(클래스를 인스턴스화)
		System.out.println("Good()");
	}

	public Goods(String name) {
		// 메모리에 올리는 일(클래스를 인스턴스화)
		this.name = name;
		System.out.println("Goods(name)");
	}

	public Goods(String name, int price) {
		// 메모리에 올리는 일(클래스를 인스턴스화)
		this(name);	// 기존 생성자중에 1개를 호출
		this.price = price;
		System.out.println("Goods(name, price)");
	}

	/*
	public Goods(String name, int price) {
		// 메모리에 올리는 일(클래스를 인스턴스화)
		this.name = name;
		this.price = price;
		System.out.println("Goods(name, price)");
	}
	 */
	// 메소드 - getter/setter
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

	// 메소드 - 일반
	public void showInfo() {
		System.out.println("상품명: " + name + ", 가격: " + price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
