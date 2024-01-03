package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		// camera
		Goods camera = new Goods();
		// camera.name="니콘";		// private 캡슐화
		camera.setName("니콘");
		// camera.price=400000;		// private 캡슐화
		camera.setPrice(400000);
		String cName = camera.getName();
		int cPrice = camera.getPrice();
		System.out.println("상품명: " + cName + ", 가격: " + cPrice + "원");
		
		camera.showInfo();
		
		// computer
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		String comName = computer.getName();
		int comPrice = computer.getPrice();
		System.out.println("상품명: " + comName + ", 가격: " + comPrice + "원");
		
		computer.showInfo();
		
		// cup
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		String cupName = cup.getName();
		int cupPrice = cup.getPrice();
		System.out.println("상품명: " + cupName + ", 가격: " + cupPrice + "원");
		
		cup.showInfo();
		
		
	}
	
}
