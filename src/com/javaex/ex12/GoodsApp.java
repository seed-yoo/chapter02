package com.javaex.ex12;

public class GoodsApp {
	
	// 필드
	
	// 생성자
	
	// 메소드 - getter/setter
	
	// 일반 - 일반
	
	public static void main(String[] args) {

		System.out.println(Goods.count);	// static 값을 가져옴
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
//		cup.setCount(100);	// setCount() count 입력은 없는게 좋음
//		System.out.println(cup.toString());
		
//		System.out.println(cup.getCount());
//		System.out.println(computer.getCount());
//		System.out.println(camera.count);
		
		System.out.println(Goods.count);	// static 값을 가져옴
		
//		camera.showInfo();
		
	}

}
