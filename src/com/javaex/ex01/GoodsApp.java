package com.javaex.ex01;


public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
//		Goods notebook = new Goods();
//		Goods mcup = new Goods();
		
		camera.name ="니콘";
		camera.price = 400000;
		
//		notebook.name = "LG그램";
//		notebook.price = 900000;
//		
//		mcup.name = "머그컵";
//		mcup.price = 20000;
		
		System.out.println("상품명: " + camera.name + ", " + "가격: " + camera.price);
//		System.out.println("상품명: " + notebook.name + ", " + "가격: " + notebook.price);
//		System.out.println("상품명: " + mcup.name + ", " + "가격: " + mcup.price);
		
		
	}

}
