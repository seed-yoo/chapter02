package com.javaex.ex02;

//import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
//		Goods test = new Goods();
		
		camera.name = "니콘";
		camera.price = 400000;
		
		computer.name = "LG그램";
		computer.price = 900000;
		
		cup.name = "머그컵";
		cup.price = 2000;
		
//		test.name = sc.nextLine();
//		test.price = sc.nextInt();
		
		
		System.out.println("상품명: " + camera.name + ", 가격: " + camera.price);
		System.out.println("상품명: " + computer.name + ", 가격: " + computer.price);
		System.out.println("상품명: " + cup.name + ", 가격: " + cup.price);
//		System.out.println("상품명: " + test.name + ", 가격: " + test.price);
		
//		sc.close();
		
	}

}
